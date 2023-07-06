package br.com.alura.knowledge08.module05;

import java.math.BigDecimal;

public enum Performance {
    REGULAR {
        @Override
        public BigDecimal readjustmentPercent() {
            return new BigDecimal("0.03");
        }
    },
    GOOD {
        @Override
        public BigDecimal readjustmentPercent() {
            return new BigDecimal("0.15");
        }
    },
    EXCELENT {
        @Override
        public BigDecimal readjustmentPercent() {
            return new BigDecimal("0.20");
        }
    };

    public abstract BigDecimal readjustmentPercent();
}
