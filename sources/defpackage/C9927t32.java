package defpackage;

import org.chromium.chrome.browser.omnibox.g;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.vr.VrModuleProvider;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: t32 */
/* loaded from: classes.dex */
public final class C9927t32 extends AbstractC11219wp3 implements N32 {
    public final KU3 e;
    public final /* synthetic */ C10613v32 f;

    public final void b(String str, boolean z) {
        C10613v32 c10613v32 = this.f;
        if (c10613v32.E || VrModuleProvider.b().a()) {
            return;
        }
        OJ0 oj0 = c10613v32.u.I;
        if (c10613v32.A != null && z) {
            if (oj0 != null) {
                oj0.a(14, true);
            }
            c10613v32.A.h(1);
            this.e.notifyEvent("ntp_voice_search_button_clicked");
            return;
        }
        if (c10613v32.z != null) {
            if (oj0 != null) {
                oj0.a(13, true);
            }
            ((g) c10613v32.z).Z(str, str == null ? 2 : 3, true);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9927t32(C10613v32 c10613v32, C9162qp3 c9162qp3, Profile profile, C7857n12 c7857n12) {
        super(c9162qp3, profile, c7857n12);
        this.f = c10613v32;
        this.e = LU3.a(profile);
    }
}
