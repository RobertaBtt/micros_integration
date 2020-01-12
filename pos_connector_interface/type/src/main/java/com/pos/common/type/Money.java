package com.pos.common.type;

import java.beans.Transient;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.Objects;

import static com.pos.common.util.validation.Validator.notNull;

/**
 * Type containing monetary amount (BigDecimal) and currency
 */
public class Money {

    private static final int scale = 2;
    private static final int rounding = BigDecimal.ROUND_HALF_UP;
    private static final BigDecimal ONE_HUNDRED = new BigDecimal(100);

    private BigDecimal amount;

    private Currency currency;


    private Money() {
    }

    private Money(BigDecimal amount, Currency currency) {

        this.amount = notNull(amount, "amount").setScale(scale, rounding);
        this.currency = notNull(currency, "currency");
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public Currency getCurrency() {
        return currency;
    }

    @Transient
    public String currencySymbol() {
        return currency.getSymbol();
    }

    @Transient
    public Long toLong() {
        return amount.multiply(ONE_HUNDRED).longValueExact();
    }

    public Money minus(Money money) {
        checkCurrency(money);
        return Money.of(this.amount.subtract(money.amount), this.currency);
    }

    public Money plus(Money money) {
        checkCurrency(money);
        return Money.of(this.amount.add(money.amount), this.currency);
    }

    public Money multiply(Money money) {
        checkCurrency(money);
        return Money.of(this.amount.multiply(money.amount), this.currency);
    }

    public Money devide(Money money) {
        checkCurrency(money);
        return Money.of(this.amount.divide(money.amount, scale, rounding), this.currency);
    }

    public boolean isGreaterThan(Money other) {
        checkCurrency(other);
        return this.amount.compareTo(other.amount) > 0;
    }

    public boolean isLessThan(Money other) {
        checkCurrency(other);
        return this.amount.compareTo(other.amount) < 0;
    }

    public boolean isEqualsTo(Money other) {
        checkCurrency(other);
        return this.amount.compareTo(other.amount) == 0;
    }

    @Transient
    public boolean isPositive() {
        return amount.signum() > 0;
    }

    @Transient
    public boolean isNegative() {
        return amount.signum() < 0;
    }

    @Transient
    public boolean isZero() {
        return amount.signum() == 0;
    }

    @Transient
    public boolean isNotNegative() {
        return amount.signum() >= 0;
    }

    private void checkCurrency(Money other) {

        if (!this.currency.equals(other.currency)) {
            throw new IllegalArgumentException("Money operations cannot be performed on different currencies!");
        }
    }

    private static Currency currency(String currency) {
        return Currency.getInstance(notNull(currency, "currency"));
    }

    public static Money of(BigDecimal amount, Currency currency) {
        return new Money(amount, currency);
    }

    public static Money of(BigDecimal amount, String currency) {
        return Money.of(amount, currency(currency));
    }

    @Transient
    public Money copy() {
        return Money.of(this.amount, this.currency);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Money money = (Money) o;
        return Objects.equals(amount, money.amount) &&
                Objects.equals(currency, money.currency);
    }

    @Override
    @Transient
    public int hashCode() {

        return Objects.hash(amount, currency);
    }

    @Override
    @Transient
    public String toString() {
        return "Money{" +
                "amount=" + amount +
                ", currency=" + currency +
                '}';
    }
}
