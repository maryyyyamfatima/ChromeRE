package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.android.chrome.R;
import org.chromium.components.browser_ui.widget.FadingShadowView;
import org.chromium.content.browser.webcontents.WebContentsImpl;
import org.chromium.content_public.browser.WebContents;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class PC0 implements PB {
    public final Runnable a;
    public final Runnable g;
    public final Runnable h;
    public final int i;
    public final K63 j = new K63();
    public final C8385oa2 k;
    public ViewGroup l;
    public FrameLayout m;
    public WebContents n;
    public Q50 o;
    public C6930kK3 p;
    public Drawable q;
    public ImageView r;

    @Override // defpackage.PB
    public final int a() {
        return 0;
    }

    @Override // defpackage.PB
    public final /* synthetic */ boolean d() {
        return false;
    }

    @Override // defpackage.PB
    public final /* synthetic */ void f() {
    }

    @Override // defpackage.PB
    public final int g() {
        return R.string.f73330_resource_name_obfuscated_res_0x7f140475;
    }

    @Override // defpackage.PB
    public final /* synthetic */ void j() {
    }

    @Override // defpackage.PB
    public final /* synthetic */ void k() {
    }

    @Override // defpackage.PB
    public final int l() {
        return R.string.f73290_resource_name_obfuscated_res_0x7f140471;
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
        return 0.0f;
    }

    @Override // defpackage.PB
    public final int q() {
        return R.string.f73300_resource_name_obfuscated_res_0x7f140472;
    }

    @Override // defpackage.PB
    public final /* synthetic */ boolean r() {
        return true;
    }

    @Override // defpackage.PB
    public final int s() {
        return R.string.f73320_resource_name_obfuscated_res_0x7f140474;
    }

    @Override // defpackage.PB
    public final float t() {
        return -1.0f;
    }

    @Override // defpackage.PB
    public final /* synthetic */ boolean u() {
        return false;
    }

    @Override // defpackage.PB
    public final boolean v() {
        return true;
    }

    public PC0(Context context, AC0 ac0, BC0 bc0, CC0 cc0, int i, C2021Po1 c2021Po1) {
        C8385oa2 c8385oa2 = new C8385oa2();
        this.k = c8385oa2;
        this.a = ac0;
        this.g = bc0;
        this.h = cc0;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.f40230_resource_name_obfuscated_res_0x7f08072d);
        this.i = dimensionPixelSize;
        this.p = new C6930kK3(context, new C6586jK3(), c2021Po1);
        this.m = new FrameLayout(context);
        C6930kK3 c6930kK3 = this.p;
        c6930kK3.getClass();
        c6930kK3.setLayoutParams(new FrameLayout.LayoutParams(-1, ((int) (i * 0.9f)) - dimensionPixelSize));
        FrameLayout frameLayout = this.m;
        C6930kK3 c6930kK32 = this.p;
        c6930kK32.getClass();
        frameLayout.addView(c6930kK32);
        this.m.setPadding(0, dimensionPixelSize, 0, 0);
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.f60850_resource_name_obfuscated_res_0x7f0e0279, (ViewGroup) null);
        this.l = viewGroup;
        ((FadingShadowView) viewGroup.findViewById(R.id.shadow)).a(context.getColor(R.color.f26860_resource_name_obfuscated_res_0x7f0708ad));
        ((ImageView) this.l.findViewById(R.id.open_in_new_tab)).setOnClickListener(new View.OnClickListener() { // from class: MC0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PC0.this.a.run();
            }
        });
        this.l.findViewById(R.id.toolbar).setOnClickListener(new View.OnClickListener() { // from class: NC0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PC0.this.g.run();
            }
        });
        this.l.findViewById(R.id.close).setOnClickListener(new View.OnClickListener() { // from class: OC0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PC0.this.h.run();
            }
        });
        ImageView imageView = (ImageView) this.l.findViewById(R.id.favicon);
        this.r = imageView;
        this.q = imageView.getDrawable();
        c8385oa2.p(Boolean.TRUE);
    }

    @Override // defpackage.PB
    public final View c() {
        return this.m;
    }

    @Override // defpackage.PB
    public final View e() {
        return this.l;
    }

    @Override // defpackage.PB
    public final int b() {
        WebContents webContents = this.n;
        if (webContents == null) {
            return 0;
        }
        return ((WebContentsImpl) webContents).m.c();
    }

    @Override // defpackage.PB
    public final void destroy() {
        this.p.b();
        this.j.s();
    }

    @Override // defpackage.PB
    public final boolean h() {
        this.h.run();
        return true;
    }

    @Override // defpackage.PB
    public final C8385oa2 o() {
        return this.k;
    }

    @Override // defpackage.PB
    public final void onBackPressed() {
        this.h.run();
    }
}
