package defpackage;

import android.widget.RelativeLayout;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes4.dex */
public final class RZ3 implements Runnable {
    public final /* synthetic */ float a;
    public final /* synthetic */ C4759e04 g;

    public RZ3(C4759e04 c4759e04, float f) {
        this.g = c4759e04;
        this.a = f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4759e04 c4759e04 = this.g;
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) c4759e04.g.getLayoutParams();
        int dimension = (int) (((int) c4759e04.a.getResources().getDimension(R.dimen.f28080_resource_name_obfuscated_res_0x7f080062)) * this.a);
        if (layoutParams.getRule(15) == -1) {
            layoutParams.width = dimension;
        } else {
            layoutParams.height = dimension;
        }
        c4759e04.g.setLayoutParams(layoutParams);
    }
}
