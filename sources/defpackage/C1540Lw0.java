package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import com.android.chrome.R;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Lw0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1540Lw0 extends BaseAdapter {
    public final Context a;
    public final List g;
    public final List h;
    public final int i;
    public final int j;
    public final int k;

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    public C1540Lw0(Activity activity, List list, List list2) {
        this.a = activity;
        this.g = list;
        this.h = list2;
        this.i = activity.getResources().getDimensionPixelSize(R.dimen.f31560_resource_name_obfuscated_res_0x7f0801f6);
        this.j = activity.getResources().getDimensionPixelSize(R.dimen.f31540_resource_name_obfuscated_res_0x7f0801f4);
        this.k = activity.getResources().getDimensionPixelSize(R.dimen.f31550_resource_name_obfuscated_res_0x7f0801f5);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.g.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return this.g.get(i);
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        ImageView imageView = (ImageView) view;
        Context context = this.a;
        if (imageView == null) {
            imageView = new ImageView(context);
        }
        imageView.setImageDrawable(AbstractC2884Wf.a(context, ((Integer) this.g.get(i)).intValue()));
        imageView.setContentDescription(context.getString(((Integer) this.h.get(i)).intValue()));
        imageView.setAdjustViewBounds(true);
        int i2 = this.i;
        imageView.setMaxWidth(i2);
        imageView.setMaxHeight(i2);
        int i3 = this.j;
        int i4 = this.k;
        imageView.setPadding(i3, i4, i3, i4);
        return imageView;
    }
}
