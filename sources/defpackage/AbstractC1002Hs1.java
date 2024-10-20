package defpackage;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.d;
import com.android.chrome.R;
import java.util.WeakHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Hs1 */
/* loaded from: classes.dex */
public abstract class AbstractC1002Hs1 {
    public static final InterpolatorC0872Gs1 b;
    public int a = -1;

    public boolean a(d dVar, d dVar2) {
        return true;
    }

    public abstract int c(RecyclerView recyclerView, d dVar);

    public float d() {
        return 0.5f;
    }

    public boolean f() {
        return !(this instanceof C1651Ms1);
    }

    public abstract boolean h(RecyclerView recyclerView, d dVar, d dVar2);

    public void i(d dVar, int i) {
    }

    public abstract void j(d dVar);

    static {
        new InterpolatorC0742Fs1();
        b = new InterpolatorC0872Gs1();
    }

    public final int e(RecyclerView recyclerView, int i, int i2, long j) {
        if (this.a == -1) {
            this.a = recyclerView.getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f08038f);
        }
        int interpolation = (int) (b.getInterpolation(Math.min(1.0f, (Math.abs(i2) * 1.0f) / i)) * ((int) Math.signum(i2)) * this.a);
        float f = j <= 2000 ? ((float) j) / 2000.0f : 1.0f;
        int i3 = (int) (f * f * f * f * f * interpolation);
        return i3 == 0 ? i2 > 0 ? 1 : -1 : i3;
    }

    public void b(RecyclerView recyclerView, d dVar) {
        View view = dVar.a;
        Object tag = view.getTag(R.id.item_touch_helper_previous_elevation);
        if (tag instanceof Float) {
            float floatValue = ((Float) tag).floatValue();
            WeakHashMap weakHashMap = Ec4.a;
            view.setElevation(floatValue);
        }
        view.setTag(R.id.item_touch_helper_previous_elevation, null);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }

    public void g(Canvas canvas, RecyclerView recyclerView, d dVar, float f, float f2, int i, boolean z) {
        View view = dVar.a;
        if (z && view.getTag(R.id.item_touch_helper_previous_elevation) == null) {
            WeakHashMap weakHashMap = Ec4.a;
            Float valueOf = Float.valueOf(view.getElevation());
            int childCount = recyclerView.getChildCount();
            float f3 = 0.0f;
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = recyclerView.getChildAt(i2);
                if (childAt != view) {
                    WeakHashMap weakHashMap2 = Ec4.a;
                    float elevation = childAt.getElevation();
                    if (elevation > f3) {
                        f3 = elevation;
                    }
                }
            }
            view.setElevation(f3 + 1.0f);
            view.setTag(R.id.item_touch_helper_previous_elevation, valueOf);
        }
        view.setTranslationX(f);
        view.setTranslationY(f2);
    }
}
