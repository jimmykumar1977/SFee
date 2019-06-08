package com.sapient.fee.calc.model;

import java.util.Date;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.sapient.fee.calc.utils.TxType;

public class TxDetails {

	private String externalTransactionID;
	private String clientId;
	private String securityId;
	private TxType transactionType;
	private Date transactionDate;
	private Double marketValue;
	private Boolean priority;

	private TxDetails() {
		super();
	}

	public String getExternalTransactionID() {
		return externalTransactionID;
	}

	public String getClientId() {
		return clientId;
	}

	public String getSecurityId() {
		return securityId;
	}

	public TxType getTransactionType() {
		return transactionType;
	}

	public Date getTransactionDate() {
		return transactionDate;
	}

	public Double getMarketValue() {
		return marketValue;
	}

	public Boolean getPriority() {
		return priority;
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	public static class TxDetailsBuilder {
		private String externalTransactionID;
		private String clientId;
		private String securityId;
		private TxType transactionType;
		private Date transactionDate;
		private Double marketValue;
		private Boolean priority;

		public TxDetailsBuilder withExternalTransactionID(String externalTransactionID) {
			this.externalTransactionID = externalTransactionID;
			return this;
		}

		public TxDetailsBuilder withClientId(String clientId) {
			this.clientId = clientId;
			return this;
		}

		public TxDetailsBuilder withSecurityId(String securityId) {
			this.securityId = securityId;
			return this;
		}

		public TxDetailsBuilder ofTransactionType(TxType transactionType) {
			this.transactionType = transactionType;
			return this;
		}

		public TxDetailsBuilder onTransactionDate(Date transactionDate) {
			this.transactionDate = transactionDate;
			return this;
		}

		public TxDetailsBuilder atMarketValue(Double marketValue) {
			this.marketValue = marketValue;
			return this;
		}

		public TxDetailsBuilder withPriority(Boolean priority) {
			this.priority = priority;
			return this;
		}

		public TxDetails build() {
			TxDetails txDetails = new TxDetails();
			txDetails.externalTransactionID = this.externalTransactionID;
			txDetails.clientId = this.clientId;
			txDetails.securityId = this.securityId;
			txDetails.transactionType = this.transactionType;
			txDetails.transactionDate = this.transactionDate;
			txDetails.marketValue = this.marketValue;
			txDetails.priority = this.priority;

			return txDetails;
		}
	}
}