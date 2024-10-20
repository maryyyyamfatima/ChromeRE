package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.android.chrome.R;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: pP1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8672pP1 extends ArrayAdapter implements AdapterView.OnItemClickListener {
    public final LayoutInflater a;
    public final Drawable g;
    public final Drawable h;
    public final Drawable i;
    public final Drawable j;

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean areAllItemsEnabled() {
        return false;
    }

    public C8672pP1(Context context, ArrayList arrayList) {
        super(context, 0, arrayList);
        this.a = LayoutInflater.from(context);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{R.attr.f10450_resource_name_obfuscated_res_0x7f050342, R.attr.f10540_resource_name_obfuscated_res_0x7f05034b, R.attr.f10510_resource_name_obfuscated_res_0x7f050348, R.attr.f10500_resource_name_obfuscated_res_0x7f050347});
        this.g = AbstractC2884Wf.a(context, obtainStyledAttributes.getResourceId(0, 0));
        this.h = AbstractC2884Wf.a(context, obtainStyledAttributes.getResourceId(1, 0));
        this.i = AbstractC2884Wf.a(context, obtainStyledAttributes.getResourceId(2, 0));
        this.j = AbstractC2884Wf.a(context, obtainStyledAttributes.getResourceId(3, 0));
        obtainStyledAttributes.recycle();
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean isEnabled(int i) {
        return ((DQ1) getItem(i)).g;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x007f, code lost:            if (r0 != null) goto L35;     */
    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View getView(int r7, android.view.View r8, android.view.ViewGroup r9) {
        /*
            r6 = this;
            r0 = 0
            if (r8 != 0) goto Lc
            android.view.LayoutInflater r8 = r6.a
            r1 = 2131624337(0x7f0e0191, float:1.887585E38)
            android.view.View r8 = r8.inflate(r1, r9, r0)
        Lc:
            java.lang.Object r7 = r6.getItem(r7)
            DQ1 r7 = (defpackage.DQ1) r7
            r9 = 2130773147(0x7f01049b, float:1.7149432E38)
            android.view.View r9 = r8.findViewById(r9)
            android.widget.TextView r9 = (android.widget.TextView) r9
            r1 = 2130773145(0x7f010499, float:1.7149428E38)
            android.view.View r1 = r8.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            java.lang.String r2 = r7.d
            r9.setText(r2)
            java.lang.String r2 = r7.e
            int r3 = r7.h
            r4 = 2
            r5 = 1
            if (r3 == r4) goto L36
            if (r3 != r5) goto L34
            goto L36
        L34:
            r3 = r0
            goto L37
        L36:
            r3 = r5
        L37:
            if (r3 == 0) goto L4b
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L4b
            r3 = 80
            r9.setGravity(r3)
            r1.setVisibility(r0)
            r1.setText(r2)
            goto L5a
        L4b:
            r0 = 16
            r9.setGravity(r0)
            r9 = 8
            r1.setVisibility(r9)
            java.lang.String r9 = ""
            r1.setText(r9)
        L5a:
            boolean r9 = r7.g
            r8.setEnabled(r9)
            r9 = 2130773146(0x7f01049a, float:1.714943E38)
            android.view.View r9 = r8.findViewById(r9)
            android.widget.ImageView r9 = (android.widget.ImageView) r9
            if (r9 == 0) goto Lb1
            android.net.Uri r0 = r7.f
            if (r0 == 0) goto L96
            android.content.Context r1 = r6.getContext()     // Catch: java.io.IOException -> L82
            android.content.ContentResolver r1 = r1.getContentResolver()     // Catch: java.io.IOException -> L82
            java.io.InputStream r1 = r1.openInputStream(r0)     // Catch: java.io.IOException -> L82
            r2 = 0
            android.graphics.drawable.Drawable r0 = android.graphics.drawable.Drawable.createFromStream(r1, r2)     // Catch: java.io.IOException -> L82
            if (r0 == 0) goto L96
            goto Lae
        L82:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Failed to load "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.String r2 = "MediaRouteChooserDialog"
            android.util.Log.w(r2, r0, r1)
        L96:
            int r0 = r7.m
            if (r0 == r5) goto Lab
            if (r0 == r4) goto La8
            boolean r7 = r7.e()
            if (r7 == 0) goto La5
            android.graphics.drawable.Drawable r7 = r6.j
            goto Lad
        La5:
            android.graphics.drawable.Drawable r7 = r6.g
            goto Lad
        La8:
            android.graphics.drawable.Drawable r7 = r6.i
            goto Lad
        Lab:
            android.graphics.drawable.Drawable r7 = r6.h
        Lad:
            r0 = r7
        Lae:
            r9.setImageDrawable(r0)
        Lb1:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C8672pP1.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        DQ1 dq1 = (DQ1) getItem(i);
        if (dq1.g) {
            ImageView imageView = (ImageView) view.findViewById(R.id.mr_chooser_route_icon);
            ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.mr_chooser_route_progress_bar);
            if (imageView != null && progressBar != null) {
                imageView.setVisibility(8);
                progressBar.setVisibility(0);
            }
            dq1.l();
        }
    }
}
