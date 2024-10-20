package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: jR2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6620jR2 extends AbstractC11676y90 {
    @Override // defpackage.AbstractC11676y90
    public final void a(float f, float f2, C7200l63 c7200l63) {
        c7200l63.d(f2 * f, 180.0f, 90.0f);
        float f3 = f2 * 2.0f * f;
        C5826h63 c5826h63 = new C5826h63(0.0f, 0.0f, f3, f3);
        c5826h63.f = 180.0f;
        c5826h63.g = 90.0f;
        c7200l63.g.add(c5826h63);
        C5138f63 c5138f63 = new C5138f63(c5826h63);
        c7200l63.a(180.0f);
        c7200l63.h.add(c5138f63);
        c7200l63.e = 270.0f;
        float f4 = (f3 + 0.0f) * 0.5f;
        float f5 = (f3 - 0.0f) / 2.0f;
        double d = 270.0f;
        c7200l63.c = (((float) Math.cos(Math.toRadians(d))) * f5) + f4;
        c7200l63.d = (f5 * ((float) Math.sin(Math.toRadians(d)))) + f4;
    }
}
