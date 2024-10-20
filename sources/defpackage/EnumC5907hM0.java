package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF6' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: hM0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC5907hM0 {
    public static final EnumC5907hM0 g;
    public static final EnumC5907hM0 h;
    public static final EnumC5907hM0[] i;
    public static final /* synthetic */ EnumC5907hM0[] j;
    public final int a;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC5907hM0 EF6;

    public static EnumC5907hM0[] values() {
        return (EnumC5907hM0[]) j.clone();
    }

    static {
        EnumC8154nt1 enumC8154nt1 = EnumC8154nt1.DOUBLE;
        EnumC5907hM0 enumC5907hM0 = new EnumC5907hM0("DOUBLE", 0, 0, 1, enumC8154nt1);
        EnumC8154nt1 enumC8154nt12 = EnumC8154nt1.FLOAT;
        EnumC5907hM0 enumC5907hM02 = new EnumC5907hM0("FLOAT", 1, 1, 1, enumC8154nt12);
        EnumC8154nt1 enumC8154nt13 = EnumC8154nt1.LONG;
        EnumC5907hM0 enumC5907hM03 = new EnumC5907hM0("INT64", 2, 2, 1, enumC8154nt13);
        EnumC5907hM0 enumC5907hM04 = new EnumC5907hM0("UINT64", 3, 3, 1, enumC8154nt13);
        EnumC8154nt1 enumC8154nt14 = EnumC8154nt1.INT;
        EnumC5907hM0 enumC5907hM05 = new EnumC5907hM0("INT32", 4, 4, 1, enumC8154nt14);
        EnumC5907hM0 enumC5907hM06 = new EnumC5907hM0("FIXED64", 5, 5, 1, enumC8154nt13);
        EnumC5907hM0 enumC5907hM07 = new EnumC5907hM0("FIXED32", 6, 6, 1, enumC8154nt14);
        EnumC8154nt1 enumC8154nt15 = EnumC8154nt1.BOOLEAN;
        EnumC5907hM0 enumC5907hM08 = new EnumC5907hM0("BOOL", 7, 7, 1, enumC8154nt15);
        EnumC8154nt1 enumC8154nt16 = EnumC8154nt1.STRING;
        EnumC5907hM0 enumC5907hM09 = new EnumC5907hM0("STRING", 8, 8, 1, enumC8154nt16);
        EnumC8154nt1 enumC8154nt17 = EnumC8154nt1.MESSAGE;
        EnumC5907hM0 enumC5907hM010 = new EnumC5907hM0("MESSAGE", 9, 9, 1, enumC8154nt17);
        EnumC8154nt1 enumC8154nt18 = EnumC8154nt1.BYTE_STRING;
        EnumC5907hM0 enumC5907hM011 = new EnumC5907hM0("BYTES", 10, 10, 1, enumC8154nt18);
        EnumC5907hM0 enumC5907hM012 = new EnumC5907hM0("UINT32", 11, 11, 1, enumC8154nt14);
        EnumC8154nt1 enumC8154nt19 = EnumC8154nt1.ENUM;
        EnumC5907hM0 enumC5907hM013 = new EnumC5907hM0("ENUM", 12, 12, 1, enumC8154nt19);
        EnumC5907hM0 enumC5907hM014 = new EnumC5907hM0("SFIXED32", 13, 13, 1, enumC8154nt14);
        EnumC5907hM0 enumC5907hM015 = new EnumC5907hM0("SFIXED64", 14, 14, 1, enumC8154nt13);
        EnumC5907hM0 enumC5907hM016 = new EnumC5907hM0("SINT32", 15, 15, 1, enumC8154nt14);
        EnumC5907hM0 enumC5907hM017 = new EnumC5907hM0("SINT64", 16, 16, 1, enumC8154nt13);
        EnumC5907hM0 enumC5907hM018 = new EnumC5907hM0("GROUP", 17, 17, 1, enumC8154nt17);
        EnumC5907hM0 enumC5907hM019 = new EnumC5907hM0("DOUBLE_LIST", 18, 18, 2, enumC8154nt1);
        EnumC5907hM0 enumC5907hM020 = new EnumC5907hM0("FLOAT_LIST", 19, 19, 2, enumC8154nt12);
        EnumC5907hM0 enumC5907hM021 = new EnumC5907hM0("INT64_LIST", 20, 20, 2, enumC8154nt13);
        EnumC5907hM0 enumC5907hM022 = new EnumC5907hM0("UINT64_LIST", 21, 21, 2, enumC8154nt13);
        EnumC5907hM0 enumC5907hM023 = new EnumC5907hM0("INT32_LIST", 22, 22, 2, enumC8154nt14);
        EnumC5907hM0 enumC5907hM024 = new EnumC5907hM0("FIXED64_LIST", 23, 23, 2, enumC8154nt13);
        EnumC5907hM0 enumC5907hM025 = new EnumC5907hM0("FIXED32_LIST", 24, 24, 2, enumC8154nt14);
        EnumC5907hM0 enumC5907hM026 = new EnumC5907hM0("BOOL_LIST", 25, 25, 2, enumC8154nt15);
        EnumC5907hM0 enumC5907hM027 = new EnumC5907hM0("STRING_LIST", 26, 26, 2, enumC8154nt16);
        EnumC5907hM0 enumC5907hM028 = new EnumC5907hM0("MESSAGE_LIST", 27, 27, 2, enumC8154nt17);
        EnumC5907hM0 enumC5907hM029 = new EnumC5907hM0("BYTES_LIST", 28, 28, 2, enumC8154nt18);
        EnumC5907hM0 enumC5907hM030 = new EnumC5907hM0("UINT32_LIST", 29, 29, 2, enumC8154nt14);
        EnumC5907hM0 enumC5907hM031 = new EnumC5907hM0("ENUM_LIST", 30, 30, 2, enumC8154nt19);
        EnumC5907hM0 enumC5907hM032 = new EnumC5907hM0("SFIXED32_LIST", 31, 31, 2, enumC8154nt14);
        EnumC5907hM0 enumC5907hM033 = new EnumC5907hM0("SFIXED64_LIST", 32, 32, 2, enumC8154nt13);
        EnumC5907hM0 enumC5907hM034 = new EnumC5907hM0("SINT32_LIST", 33, 33, 2, enumC8154nt14);
        EnumC5907hM0 enumC5907hM035 = new EnumC5907hM0("SINT64_LIST", 34, 34, 2, enumC8154nt13);
        EnumC5907hM0 enumC5907hM036 = new EnumC5907hM0("DOUBLE_LIST_PACKED", 35, 35, 3, enumC8154nt1);
        g = enumC5907hM036;
        EnumC5907hM0 enumC5907hM037 = new EnumC5907hM0("FLOAT_LIST_PACKED", 36, 36, 3, enumC8154nt12);
        EnumC5907hM0 enumC5907hM038 = new EnumC5907hM0("INT64_LIST_PACKED", 37, 37, 3, enumC8154nt13);
        EnumC5907hM0 enumC5907hM039 = new EnumC5907hM0("UINT64_LIST_PACKED", 38, 38, 3, enumC8154nt13);
        EnumC5907hM0 enumC5907hM040 = new EnumC5907hM0("INT32_LIST_PACKED", 39, 39, 3, enumC8154nt14);
        EnumC5907hM0 enumC5907hM041 = new EnumC5907hM0("FIXED64_LIST_PACKED", 40, 40, 3, enumC8154nt13);
        EnumC5907hM0 enumC5907hM042 = new EnumC5907hM0("FIXED32_LIST_PACKED", 41, 41, 3, enumC8154nt14);
        EnumC5907hM0 enumC5907hM043 = new EnumC5907hM0("BOOL_LIST_PACKED", 42, 42, 3, enumC8154nt15);
        EnumC5907hM0 enumC5907hM044 = new EnumC5907hM0("UINT32_LIST_PACKED", 43, 43, 3, enumC8154nt14);
        EnumC5907hM0 enumC5907hM045 = new EnumC5907hM0("ENUM_LIST_PACKED", 44, 44, 3, enumC8154nt19);
        EnumC5907hM0 enumC5907hM046 = new EnumC5907hM0("SFIXED32_LIST_PACKED", 45, 45, 3, enumC8154nt14);
        EnumC5907hM0 enumC5907hM047 = new EnumC5907hM0("SFIXED64_LIST_PACKED", 46, 46, 3, enumC8154nt13);
        EnumC5907hM0 enumC5907hM048 = new EnumC5907hM0("SINT32_LIST_PACKED", 47, 47, 3, enumC8154nt14);
        EnumC5907hM0 enumC5907hM049 = new EnumC5907hM0("SINT64_LIST_PACKED", 48, 48, 3, enumC8154nt13);
        h = enumC5907hM049;
        j = new EnumC5907hM0[]{enumC5907hM0, enumC5907hM02, enumC5907hM03, enumC5907hM04, enumC5907hM05, enumC5907hM06, enumC5907hM07, enumC5907hM08, enumC5907hM09, enumC5907hM010, enumC5907hM011, enumC5907hM012, enumC5907hM013, enumC5907hM014, enumC5907hM015, enumC5907hM016, enumC5907hM017, enumC5907hM018, enumC5907hM019, enumC5907hM020, enumC5907hM021, enumC5907hM022, enumC5907hM023, enumC5907hM024, enumC5907hM025, enumC5907hM026, enumC5907hM027, enumC5907hM028, enumC5907hM029, enumC5907hM030, enumC5907hM031, enumC5907hM032, enumC5907hM033, enumC5907hM034, enumC5907hM035, enumC5907hM036, enumC5907hM037, enumC5907hM038, enumC5907hM039, enumC5907hM040, enumC5907hM041, enumC5907hM042, enumC5907hM043, enumC5907hM044, enumC5907hM045, enumC5907hM046, enumC5907hM047, enumC5907hM048, enumC5907hM049, new EnumC5907hM0("GROUP_LIST", 49, 49, 2, enumC8154nt17), new EnumC5907hM0("MAP", 50, 50, 4, EnumC8154nt1.VOID)};
        EnumC5907hM0[] values = values();
        i = new EnumC5907hM0[values.length];
        for (EnumC5907hM0 enumC5907hM050 : values) {
            i[enumC5907hM050.a] = enumC5907hM050;
        }
    }

    public EnumC5907hM0(String str, int i2, int i3, int i4, EnumC8154nt1 enumC8154nt1) {
        this.a = i3;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i4 - 1;
        if (i5 == 1) {
            enumC8154nt1.getClass();
        } else if (i5 == 3) {
            enumC8154nt1.getClass();
        }
        if (i4 == 1) {
            enumC8154nt1.ordinal();
        }
    }

    public final int a() {
        return this.a;
    }
}
