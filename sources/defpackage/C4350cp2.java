package defpackage;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.chrome.R;
import org.chromium.content.browser.webcontents.WebContentsImpl;
import org.chromium.content_public.browser.WebContents;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: cp2 */
/* loaded from: classes.dex */
public final class C4350cp2 implements PB {
    public final View a;
    public final FrameLayout g;
    public final View h;
    public final WebContents i;
    public final C8385oa2 j;
    public Runnable k;

    @Override // defpackage.PB
    public final int a() {
        return 0;
    }

    @Override // defpackage.PB
    public final boolean d() {
        return true;
    }

    @Override // defpackage.PB
    public final void destroy() {
    }

    @Override // defpackage.PB
    public final /* synthetic */ void f() {
    }

    @Override // defpackage.PB
    public final int g() {
        return R.string.0_resource_name_obfuscated_res_0x7f1407f4;
    }

    @Override // defpackage.PB
    public final /* synthetic */ void j() {
    }

    @Override // defpackage.PB
    public final /* synthetic */ void k() {
    }

    @Override // defpackage.PB
    public final int l() {
        return R.string.0_resource_name_obfuscated_res_0x7f1407f1;
    }

    @Override // defpackage.PB
    public final int m() {
        return -2;
    }

    @Override // defpackage.PB
    public final /* synthetic */ void n() {
    }

    @Override // defpackage.PB
    public final float p() {
        return 0.5f;
    }

    @Override // defpackage.PB
    public final int q() {
        return R.string.0_resource_name_obfuscated_res_0x7f1407f2;
    }

    @Override // defpackage.PB
    public final /* synthetic */ boolean r() {
        return true;
    }

    @Override // defpackage.PB
    public final int s() {
        return R.string.0_resource_name_obfuscated_res_0x7f1407f3;
    }

    @Override // defpackage.PB
    public final float t() {
        return 0.9f;
    }

    @Override // defpackage.PB
    public final /* synthetic */ boolean u() {
        return false;
    }

    @Override // defpackage.PB
    public final boolean v() {
        return true;
    }

    public C4350cp2(Activity activity, WebContents webContents, View view, C6930kK3 c6930kK3) {
        C8385oa2 c8385oa2 = new C8385oa2();
        this.j = c8385oa2;
        this.i = webContents;
        this.a = view;
        this.h = c6930kK3;
        int dimensionPixelSize = activity.getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f08072d);
        FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(activity).inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e01ea, (ViewGroup) null);
        this.g = frameLayout;
        frameLayout.setPadding(0, dimensionPixelSize, 0, 0);
        frameLayout.addView(c6930kK3, 0);
        c8385oa2.p(Boolean.TRUE);
    }

    @Override // defpackage.PB
    public final View c() {
        return this.g;
    }

    @Override // defpackage.PB
    public final View e() {
        return this.a;
    }

    @Override // defpackage.PB
    public final int b() {
        WebContents webContents = this.i;
        if (webContents == null) {
            return 0;
        }
        return ((WebContentsImpl) webContents).m.c();
    }

    @Override // defpackage.PB
    public final boolean h() {
        this.k.run();
        return true;
    }

    @Override // defpackage.PB
    public final C8385oa2 o() {
        return this.j;
    }

    @Override // defpackage.PB
    public final void onBackPressed() {
        this.k.run();
    }
}
