package defpackage;

import J.N;
import android.content.Context;
import com.android.chrome.R;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: m71, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7548m71 implements InterfaceC7471lu0 {
    public final InterfaceC6070hp3 a;
    public final InterfaceC9158qp b;
    public boolean c;
    public boolean d;

    @Override // defpackage.InterfaceC7471lu0
    public final void d(boolean z) {
        throw null;
    }

    @Override // defpackage.InterfaceC7471lu0
    public final /* synthetic */ void e() {
        throw null;
    }

    @Override // defpackage.InterfaceC7471lu0
    public final int f() {
        return 6;
    }

    public C7548m71(Context context, C1245Jp c1245Jp, InterfaceC9158qp interfaceC9158qp) {
        this.a = c1245Jp;
        this.b = interfaceC9158qp;
        context.getResources().getDimensionPixelSize(R.dimen.f37820_resource_name_obfuscated_res_0x7f08062d);
    }

    @Override // defpackage.InterfaceC7471lu0
    public final PropertyModel g() {
        return new PropertyModel(AbstractC9264r71.e);
    }

    @Override // defpackage.InterfaceC7471lu0
    public final void a() {
        C7928nE c7928nE = UN.a;
        this.c = N.M09VlOh_("OmniboxRemoveSuggestionHeaderChevron");
        this.d = N.M6bsIDpc("OmniboxRemoveSuggestionHeaderChevron", "allow_group_collapsed_state", true);
    }
}
