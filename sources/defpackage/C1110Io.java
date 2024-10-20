package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Io, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1110Io {
    public String a;
    public Long b;
    public Long c;
    public Long d;
    public Integer e;
    public C1500Lo f;

    public final C1240Jo a() {
        String str = this.a;
        if (str == null) {
            throw new IllegalStateException("Missing required properties: name");
        }
        return new C1240Jo(str, this.b, this.c, this.d, this.e, this.f);
    }
}
