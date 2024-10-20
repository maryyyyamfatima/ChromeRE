package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class ZF0 {
    public static final YF0 a = new YF0();
    public static final YF0 b;

    static {
        YF0 yf0;
        try {
            yf0 = (YF0) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            yf0 = null;
        }
        b = yf0;
    }
}
