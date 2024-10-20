package defpackage;

import com.android.chrome.R;
import org.chromium.chrome.browser.profiles.Profile;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: cG3 */
/* loaded from: classes2.dex */
public final class C4161cG3 extends AbstractC11219wp3 {
    public final /* synthetic */ C4505dG3 e;

    @Override // defpackage.AbstractC11219wp3, defpackage.InterfaceC10876vp3
    public final boolean isVisible() {
        C4505dG3 c4505dG3 = this.e;
        return c4505dG3.b.getVisibility() == 0 && c4505dG3.b.findViewById(R.id.mv_tiles_layout).getVisibility() == 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4161cG3(C4505dG3 c4505dG3, C4254cZ1 c4254cZ1, Profile profile) {
        super(c4254cZ1, profile, null);
        this.e = c4505dG3;
    }
}
