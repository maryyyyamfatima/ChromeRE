package androidx.mediarouter.app;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.chrome.R;
import defpackage.DQ1;
import java.util.HashSet;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class c extends ArrayAdapter {
    public final float a;
    public final /* synthetic */ d g;

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean isEnabled(int i) {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, Context context, List list) {
        super(context, 0, list);
        this.g = dVar;
        this.a = f.d(context);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        d dVar = this.g;
        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e0193, viewGroup, false);
        } else {
            dVar.getClass();
            d.l((LinearLayout) view.findViewById(R.id.volume_item_container), dVar.S);
            View findViewById = view.findViewById(R.id.mr_volume_item_icon);
            ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            int i2 = dVar.R;
            layoutParams.width = i2;
            layoutParams.height = i2;
            findViewById.setLayoutParams(layoutParams);
        }
        DQ1 dq1 = (DQ1) getItem(i);
        if (dq1 != null) {
            boolean z = dq1.g;
            TextView textView = (TextView) view.findViewById(R.id.mr_name);
            textView.setEnabled(z);
            textView.setText(dq1.d);
            MediaRouteVolumeSlider mediaRouteVolumeSlider = (MediaRouteVolumeSlider) view.findViewById(R.id.mr_volume_slider);
            f.i(viewGroup.getContext(), mediaRouteVolumeSlider, dVar.I);
            mediaRouteVolumeSlider.setTag(dq1);
            dVar.V.put(dq1, mediaRouteVolumeSlider);
            mediaRouteVolumeSlider.b(!z);
            mediaRouteVolumeSlider.setEnabled(z);
            if (z) {
                if (dVar.C && dq1.c() == 1) {
                    mediaRouteVolumeSlider.setMax(dq1.p);
                    mediaRouteVolumeSlider.setProgress(dq1.o);
                    mediaRouteVolumeSlider.setOnSeekBarChangeListener(dVar.P);
                } else {
                    mediaRouteVolumeSlider.setMax(100);
                    mediaRouteVolumeSlider.setProgress(100);
                    mediaRouteVolumeSlider.setEnabled(false);
                }
            }
            ((ImageView) view.findViewById(R.id.mr_volume_item_icon)).setAlpha(z ? 255 : (int) (this.a * 255.0f));
            ((LinearLayout) view.findViewById(R.id.volume_item_container)).setVisibility(dVar.N.contains(dq1) ? 4 : 0);
            HashSet hashSet = dVar.L;
            if (hashSet != null && hashSet.contains(dq1)) {
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 0.0f);
                alphaAnimation.setDuration(0L);
                alphaAnimation.setFillEnabled(true);
                alphaAnimation.setFillAfter(true);
                view.clearAnimation();
                view.startAnimation(alphaAnimation);
            }
        }
        return view;
    }
}
