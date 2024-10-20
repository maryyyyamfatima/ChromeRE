package defpackage;

import java.util.Map;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: hE1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5868hE1 implements YC0 {
    public final AbstractC9896sy0 a;

    public C5868hE1(AbstractC9896sy0 abstractC9896sy0) {
        this.a = abstractC9896sy0;
    }

    @Override // defpackage.YC0
    public final void b(EnumC11375xH1 enumC11375xH1, String str, String str2) {
        EnumC11438xU enumC11438xU;
        int ordinal = enumC11375xH1.ordinal();
        if (ordinal == 1 || ordinal == 2) {
            enumC11438xU = EnumC11438xU.A;
        } else {
            enumC11438xU = EnumC11438xU.s;
        }
        this.a.a(enumC11438xU, str2);
    }

    @Override // defpackage.YC0
    public final void a(String str, NullPointerException nullPointerException) {
        b(EnumC11375xH1.ERROR, "LITHO:NPE:UNSET_PADDING", str);
    }

    @Override // defpackage.YC0
    public final void c(EnumC11375xH1 enumC11375xH1, String str, String str2, Map map) {
        b(enumC11375xH1, str, str2);
    }
}
