package defpackage;

import android.content.res.Resources;
import android.view.View;
import com.android.chrome.R;
import java.util.Objects;
import org.chromium.chrome.browser.ntp.NewTabPageLayout;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Xf3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3018Xf3 implements InterfaceC2498Tf3 {
    public final N32 a;
    public final NewTabPageLayout b;
    public final RunnableC2758Vf3 d;
    public final int e;
    public final int f;
    public View g;
    public boolean h;
    public int i = -1;
    public final RunnableC2888Wf3 c = new RunnableC2888Wf3(this);

    /* JADX WARN: Type inference failed for: r2v2, types: [Vf3] */
    public C3018Xf3(C9927t32 c9927t32, final NewTabPageLayout newTabPageLayout) {
        this.a = c9927t32;
        this.b = newTabPageLayout;
        Objects.requireNonNull(newTabPageLayout);
        this.d = new Runnable() { // from class: Vf3
            @Override // java.lang.Runnable
            public final void run() {
                NewTabPageLayout.this.n();
            }
        };
        Resources resources = newTabPageLayout.getResources();
        this.e = resources.getDimensionPixelSize(R.dimen.f42350_resource_name_obfuscated_res_0x7f080808) + resources.getDimensionPixelSize(R.dimen.f42300_resource_name_obfuscated_res_0x7f080803);
        this.f = resources.getDimensionPixelSize(R.dimen.f37610_resource_name_obfuscated_res_0x7f080618);
    }

    public final void a() {
        NewTabPageLayout newTabPageLayout = this.b;
        int i = ((SK0) newTabPageLayout.I).i();
        if (this.i == i) {
            return;
        }
        this.i = i;
        if (this.h) {
            View view = this.g;
            RunnableC2888Wf3 runnableC2888Wf3 = this.c;
            view.removeCallbacks(runnableC2888Wf3);
            this.g.postDelayed(runnableC2888Wf3, 30L);
        }
        newTabPageLayout.n();
    }
}
