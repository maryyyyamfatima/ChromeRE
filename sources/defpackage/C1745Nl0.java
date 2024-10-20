package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.chrome.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Nl0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1745Nl0 extends ArrayAdapter implements AdapterView.OnItemClickListener {
    public final LayoutInflater a;
    public final Resources g;
    public final boolean h;
    public final int i;
    public int j;
    public final HashMap k;
    public final HashMap l;
    public boolean m;
    public C12264zs1 n;

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getViewTypeCount() {
        return 1;
    }

    public C1745Nl0(int i, Context context, boolean z) {
        super(context, i);
        this.j = -1;
        this.k = new HashMap();
        this.l = new HashMap();
        this.a = LayoutInflater.from(context);
        this.g = context.getResources();
        this.h = z;
        this.i = i;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean isEmpty() {
        return super.isEmpty();
    }

    public final void a(Drawable drawable, String str, String str2, String str3) {
        Drawable drawable2;
        HashMap hashMap = this.l;
        C1875Ol0 c1875Ol0 = (C1875Ol0) hashMap.get(str);
        if (c1875Ol0 != null) {
            boolean z = false;
            if (TextUtils.equals(c1875Ol0.a, str) && TextUtils.equals(c1875Ol0.b, str2) && TextUtils.equals(c1875Ol0.d, str3)) {
                if (drawable != null && (drawable2 = c1875Ol0.c) != null) {
                    Drawable newDrawable = drawable2.getConstantState().newDrawable();
                    Drawable newDrawable2 = drawable.getConstantState().newDrawable();
                    Bitmap createBitmap = Bitmap.createBitmap(newDrawable.getIntrinsicWidth(), newDrawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas();
                    canvas.setBitmap(createBitmap);
                    newDrawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                    newDrawable.draw(canvas);
                    Bitmap createBitmap2 = Bitmap.createBitmap(newDrawable2.getIntrinsicWidth(), newDrawable2.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas();
                    canvas2.setBitmap(createBitmap2);
                    newDrawable2.setBounds(0, 0, canvas2.getWidth(), canvas2.getHeight());
                    newDrawable2.draw(canvas2);
                    z = createBitmap.sameAs(createBitmap2);
                } else if (drawable == null && c1875Ol0.c == null) {
                    z = true;
                }
            }
            if (z) {
                return;
            }
            if (!TextUtils.equals(c1875Ol0.b, str2)) {
                c(c1875Ol0.b);
                c1875Ol0.b = str2;
                b(str2);
            }
            if (!Objects.equals(drawable, c1875Ol0.c)) {
                c1875Ol0.c = drawable;
                c1875Ol0.d = str3;
            }
            notifyDataSetChanged();
            return;
        }
        C1875Ol0 c1875Ol02 = new C1875Ol0(drawable, str, str2, str3);
        hashMap.put(str, c1875Ol02);
        b(c1875Ol02.b);
        add(c1875Ol02);
    }

    @Override // android.widget.ArrayAdapter
    public final void clear() {
        this.l.clear();
        this.k.clear();
        d(-1);
        super.clear();
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean isEnabled(int i) {
        return this.h;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        C1615Ml0 c1615Ml0;
        if (view == null) {
            view = this.a.inflate(this.i, viewGroup, false);
            c1615Ml0 = new C1615Ml0(view);
            view.setTag(c1615Ml0);
        } else {
            c1615Ml0 = (C1615Ml0) view.getTag();
        }
        c1615Ml0.a.setSelected(i == this.j);
        boolean z = this.h;
        TextView textView = c1615Ml0.a;
        textView.setEnabled(z);
        C1875Ol0 c1875Ol0 = (C1875Ol0) getItem(i);
        String str = c1875Ol0.b;
        if (((Integer) this.k.get(str)).intValue() != 1) {
            str = this.g.getString(R.string.f75600_resource_name_obfuscated_res_0x7f140571, str, c1875Ol0.a);
        }
        textView.setText(str);
        ImageView imageView = c1615Ml0.b;
        if (imageView != null) {
            if (!this.m) {
                imageView.setVisibility(8);
            } else {
                C1875Ol0 c1875Ol02 = (C1875Ol0) getItem(i);
                if (c1875Ol02.c != null) {
                    imageView.setContentDescription(c1875Ol02.d);
                    imageView.setImageDrawable(c1875Ol02.c);
                    imageView.setVisibility(0);
                } else {
                    imageView.setVisibility(4);
                    imageView.setImageDrawable(null);
                    imageView.setContentDescription(null);
                }
                imageView.setSelected(i == this.j);
            }
        }
        return view;
    }

    @Override // android.widget.ArrayAdapter, android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        this.m = false;
        Iterator it = this.l.values().iterator();
        while (it.hasNext()) {
            if (((C1875Ol0) it.next()).c != null) {
                this.m = true;
            }
        }
        super.notifyDataSetChanged();
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        d(i);
        notifyDataSetChanged();
    }

    public final void b(String str) {
        HashMap hashMap = this.k;
        hashMap.put(str, Integer.valueOf((hashMap.containsKey(str) ? ((Integer) hashMap.get(str)).intValue() : 0) + 1));
    }

    public final void c(String str) {
        HashMap hashMap = this.k;
        if (hashMap.containsKey(str)) {
            int intValue = ((Integer) hashMap.get(str)).intValue();
            if (intValue == 1) {
                hashMap.remove(str);
            } else {
                hashMap.put(str, Integer.valueOf(intValue - 1));
            }
        }
    }

    public final void d(int i) {
        this.j = i;
        C12264zs1 c12264zs1 = this.n;
        if (c12264zs1 != null) {
            c12264zs1.i.setEnabled(i != -1);
        }
    }
}
