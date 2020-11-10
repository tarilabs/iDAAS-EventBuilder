package io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7;

public enum HL7Versions {
    VERSION_2_5_1("2.5.1");

    private String value;

    HL7Versions(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
}
