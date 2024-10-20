package defpackage;

import J.N;
import android.view.ViewGroup;
import com.android.chrome.R;
import org.chromium.components.messages.MessageContainer;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: cV1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4234cV1 implements GC {
    public MessageContainer a;
    public CC g;

    @Override // defpackage.GC
    public final /* synthetic */ void e() {
    }

    @Override // defpackage.GC
    public final /* synthetic */ void k(int i) {
    }

    public C4234cV1(MessageContainer messageContainer, CC cc) {
        this.a = messageContainer;
        this.g = cc;
        cc.d(this);
    }

    public final void c() {
        if (this.a.getVisibility() != 0) {
            C7928nE c7928nE = UN.a;
            if (N.M09VlOh_("MessagesForAndroidReduceLayoutChanges")) {
                return;
            }
        }
        C5153f90 c5153f90 = (C5153f90) this.a.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) c5153f90).topMargin = a();
        this.a.setLayoutParams(c5153f90);
    }

    @Override // defpackage.GC
    public final void b(boolean z, int i, int i2, int i3) {
        c();
    }

    @Override // defpackage.GC
    public final void r() {
        c();
    }

    public final int a() {
        if (this.g.t == 0) {
            return 0;
        }
        return (this.g.t - this.a.getResources().getDimensionPixelOffset(R.dimen.f35680_resource_name_obfuscated_res_0x7f0804dd)) - this.a.getResources().getDimensionPixelOffset(R.dimen.f35850_resource_name_obfuscated_res_0x7f0804ee);
    }
}
