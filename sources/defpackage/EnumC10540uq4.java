package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF2' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: uq4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class EnumC10540uq4 {
    public static final EnumC10540uq4 h;
    public static final C9169qq4 i;
    public static final C9511rq4 j;
    public static final C9854sq4 k;
    public static final C10197tq4 l;
    public static final EnumC10540uq4 m;
    public static final EnumC10540uq4 n;
    public static final /* synthetic */ EnumC10540uq4[] o;
    public final EnumC10883vq4 a;
    public final int g;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC10540uq4 EF0;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC10540uq4 EF1;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC10540uq4 EF2;

    public static EnumC10540uq4[] values() {
        return (EnumC10540uq4[]) o.clone();
    }

    static {
        EnumC10540uq4 enumC10540uq4 = new EnumC10540uq4("DOUBLE", 0, EnumC10883vq4.j, 1);
        EnumC10540uq4 enumC10540uq42 = new EnumC10540uq4("FLOAT", 1, EnumC10883vq4.i, 5);
        EnumC10883vq4 enumC10883vq4 = EnumC10883vq4.h;
        EnumC10540uq4 enumC10540uq43 = new EnumC10540uq4("INT64", 2, enumC10883vq4, 0);
        EnumC10540uq4 enumC10540uq44 = new EnumC10540uq4("UINT64", 3, enumC10883vq4, 0);
        EnumC10883vq4 enumC10883vq42 = EnumC10883vq4.g;
        EnumC10540uq4 enumC10540uq45 = new EnumC10540uq4("INT32", 4, enumC10883vq42, 0);
        h = enumC10540uq45;
        EnumC10540uq4 enumC10540uq46 = new EnumC10540uq4("FIXED64", 5, enumC10883vq4, 1);
        EnumC10540uq4 enumC10540uq47 = new EnumC10540uq4("FIXED32", 6, enumC10883vq42, 5);
        EnumC10540uq4 enumC10540uq48 = new EnumC10540uq4("BOOL", 7, EnumC10883vq4.k, 0);
        C9169qq4 c9169qq4 = new C9169qq4();
        i = c9169qq4;
        EnumC10883vq4 enumC10883vq43 = EnumC10883vq4.o;
        C9511rq4 c9511rq4 = new C9511rq4(enumC10883vq43);
        j = c9511rq4;
        C9854sq4 c9854sq4 = new C9854sq4(enumC10883vq43);
        k = c9854sq4;
        C10197tq4 c10197tq4 = new C10197tq4(EnumC10883vq4.m);
        l = c10197tq4;
        EnumC10540uq4 enumC10540uq49 = new EnumC10540uq4("UINT32", 12, enumC10883vq42, 0);
        m = enumC10540uq49;
        EnumC10540uq4 enumC10540uq410 = new EnumC10540uq4("ENUM", 13, EnumC10883vq4.n, 0);
        n = enumC10540uq410;
        o = new EnumC10540uq4[]{enumC10540uq4, enumC10540uq42, enumC10540uq43, enumC10540uq44, enumC10540uq45, enumC10540uq46, enumC10540uq47, enumC10540uq48, c9169qq4, c9511rq4, c9854sq4, c10197tq4, enumC10540uq49, enumC10540uq410, new EnumC10540uq4("SFIXED32", 14, enumC10883vq42, 5), new EnumC10540uq4("SFIXED64", 15, enumC10883vq4, 1), new EnumC10540uq4("SINT32", 16, enumC10883vq42, 0), new EnumC10540uq4("SINT64", 17, enumC10883vq4, 0)};
    }

    public EnumC10540uq4(String str, int i2, EnumC10883vq4 enumC10883vq4, int i3) {
        this.a = enumC10883vq4;
        this.g = i3;
    }
}
