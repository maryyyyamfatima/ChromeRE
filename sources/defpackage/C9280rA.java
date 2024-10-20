package defpackage;

import android.content.ComponentName;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: rA */
/* loaded from: classes.dex */
public final class C9280rA extends AbstractC5426fx {
    public C8252oA l;
    public final String m;

    @Override // defpackage.InterfaceC5451g12
    public final String q() {
        return "bookmarks";
    }

    public C9280rA(ComponentName componentName, ViewOnClickListenerC1069If3 viewOnClickListenerC1069If3, boolean z, C7857n12 c7857n12) {
        super(c7857n12);
        C8252oA c8252oA = new C8252oA(c7857n12.a(), componentName, false, z, viewOnClickListenerC1069If3);
        this.l = c8252oA;
        c8252oA.l = this;
        this.m = c7857n12.a().getResources().getString(R.string.0_resource_name_obfuscated_res_0x7f1402af);
        d(this.l.h);
    }

    @Override // defpackage.InterfaceC5451g12
    public final String getTitle() {
        return this.m;
    }

    @Override // defpackage.AbstractC5426fx, defpackage.InterfaceC5451g12
    public final void destroy() {
        this.l.e();
        this.l = null;
        super.destroy();
    }

    @Override // defpackage.AbstractC5426fx, defpackage.InterfaceC5451g12
    public final void n(String str) {
        this.k = str;
        this.l.j(str);
    }
}
