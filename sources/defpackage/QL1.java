package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class QL1 {
    public static final PL1 a;
    public static final PL1 b;

    static {
        PL1 pl1;
        try {
            pl1 = (PL1) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            pl1 = null;
        }
        a = pl1;
        b = new PL1();
    }
}
