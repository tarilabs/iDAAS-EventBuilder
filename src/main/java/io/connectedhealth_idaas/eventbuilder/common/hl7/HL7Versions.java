package io.connectedhealth_idaas.eventbuilder.common.hl7;

public enum HL7Versions {
    VERSION_2_5_1("2.5.1"),
    VERSION_2_6("2.6"),
    VERSION_2_7("2.7"),
    VERSION_2_8("2.8");

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
