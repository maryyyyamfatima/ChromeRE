package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: e04, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4759e04 {
    public final Context a;
    public final FrameLayout b;
    public View c;
    public ImageButton d;
    public View e;
    public ImageButton f;
    public RelativeLayout g;
    public CW3 h;
    public RelativeLayout i;
    public volatile Runnable n;
    public volatile String q;
    public int s;
    public volatile boolean j = true;
    public volatile boolean k = true;
    public volatile Runnable l = null;
    public volatile Runnable m = null;
    public volatile Runnable o = null;
    public volatile boolean p = false;
    public volatile float r = 1.0f;

    public C4759e04(Context context) {
        this.a = context;
        this.b = new C4416d04(this, context);
        c(R.layout.f61840_resource_name_obfuscated_res_0x7f0e02dc);
    }

    public static int b(boolean z) {
        return z ? 0 : 8;
    }

    public final void c(int i) {
        this.s = i;
        CW3 cw3 = this.h;
        boolean z = (cw3 == null || cw3.getParent() == null) ? false : true;
        this.h = null;
        RelativeLayout relativeLayout = this.i;
        if (relativeLayout != null) {
            this.b.removeView(relativeLayout);
        }
        RelativeLayout relativeLayout2 = (RelativeLayout) LayoutInflater.from(this.a).inflate(i, (ViewGroup) null, false);
        this.i = relativeLayout2;
        this.b.addView(relativeLayout2);
        if (z) {
            boolean z2 = this.p;
            this.p = z2;
            KK3.a(new SZ3(this, z2));
        }
        this.n = new VZ3(this);
        View findViewById = this.i.findViewById(R.id.ui_settings_button_holder);
        this.c = findViewById;
        if (findViewById != null) {
            findViewById.setVisibility(b(this.k));
            this.c.setOnClickListener(new WZ3(this));
        }
        ImageButton imageButton = (ImageButton) this.i.findViewById(R.id.ui_settings_button);
        this.d = imageButton;
        imageButton.setVisibility(b(this.k));
        this.d.setContentDescription("Settings");
        this.d.setOnClickListener(new XZ3(this));
        View findViewById2 = this.i.findViewById(R.id.ui_back_button_holder);
        this.e = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setVisibility(b(this.m != null));
            this.e.setOnClickListener(new YZ3(this));
        }
        ImageButton imageButton2 = (ImageButton) this.i.findViewById(R.id.ui_back_button);
        this.f = imageButton2;
        imageButton2.setVisibility(b(this.m != null));
        this.f.setOnClickListener(new ZZ3(this));
        if (ActivityManager.isRunningInTestHarness()) {
            View view = this.c;
            if (view != null) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.height = -2;
                layoutParams.width = -2;
                this.c.setLayoutParams(layoutParams);
            }
            View view2 = this.e;
            if (view2 != null) {
                ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
                layoutParams2.height = -2;
                layoutParams2.width = -2;
                this.e.setLayoutParams(layoutParams2);
            }
        }
        RelativeLayout relativeLayout3 = (RelativeLayout) this.i.findViewById(R.id.ui_alignment_marker);
        this.g = relativeLayout3;
        relativeLayout3.setVisibility(b(true));
        d(this.r);
    }

    public static CW3 a(C4759e04 c4759e04) {
        if (c4759e04.h == null) {
            c4759e04.h = new CW3(c4759e04.a);
            c4759e04.h.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
            c4759e04.h.setVisibility(b(c4759e04.p));
            if (c4759e04.q != null) {
                c4759e04.h.c(c4759e04.q);
            }
            if (c4759e04.o != null) {
                c4759e04.h.i = c4759e04.o;
            }
            CW3 cw3 = c4759e04.h;
            cw3.k = c4759e04.m;
            cw3.d();
            c4759e04.i.addView(c4759e04.h);
        }
        return c4759e04.h;
    }

    public final void d(float f) {
        if (this.r == f && f == 1.0f) {
            return;
        }
        this.r = f;
        KK3.a(new RZ3(this, f));
    }
}
