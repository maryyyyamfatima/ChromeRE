package defpackage;

import android.content.Context;
import android.view.View;
import com.android.chrome.R;
import org.chromium.components.browser_ui.widget.FadingEdgeScrollView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: kh2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7051kh2 extends FadingEdgeScrollView {
    public final /* synthetic */ View k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7051kh2(C7739mh2 c7739mh2, Context context, Context context2, View view) {
        super(context, null);
        this.k = view;
        if (c7739mh2.a != null) {
            int dimension = (int) context2.getResources().getDimension(R.dimen.f38070_resource_name_obfuscated_res_0x7f080646);
            setBackground(AbstractC2884Wf.a(getContext(), R.drawable.f51910_resource_name_obfuscated_res_0x7f0903f8));
            setPadding(0, 0, 0, dimension);
        }
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        View view = this.k;
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(view != null ? (view.getHeight() * 90) / 100 : 0, Integer.MIN_VALUE));
    }
}
