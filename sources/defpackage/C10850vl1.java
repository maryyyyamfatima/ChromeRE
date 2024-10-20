package defpackage;

import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: vl1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10850vl1 {
    public final FrameLayout a;
    public final int b;
    public final int c;
    public boolean d;
    public View e;
    public View f;

    public C10850vl1(FrameLayout frameLayout) {
        this.a = frameLayout;
        Resources resources = frameLayout.getContext().getResources();
        this.b = resources.getDimensionPixelSize(R.dimen.f34250_resource_name_obfuscated_res_0x7f080381);
        this.c = resources.getDimensionPixelSize(R.dimen.f34300_resource_name_obfuscated_res_0x7f080386);
    }

    public final void a() {
        if (this.d) {
            FrameLayout frameLayout = this.a;
            float height = frameLayout.getHeight();
            int childCount = frameLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = frameLayout.getChildAt(i);
                if (childAt != this.e && childAt != this.f) {
                    height = Math.min(height, childAt.getY());
                }
            }
            this.e.setY(height);
            this.f.setY(height);
        }
    }
}
