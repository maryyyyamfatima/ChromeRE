package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: yS1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11773yS1 extends BaseAdapter {
    public final BS1 a;
    public int g = -1;
    public boolean h;
    public final boolean i;
    public final LayoutInflater j;
    public final int k;

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    public C11773yS1(BS1 bs1, LayoutInflater layoutInflater, boolean z, int i) {
        this.i = z;
        this.j = layoutInflater;
        this.a = bs1;
        this.k = i;
        a();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList l;
        boolean z = this.i;
        BS1 bs1 = this.a;
        if (!z) {
            l = bs1.l();
        } else {
            bs1.i();
            l = bs1.j;
        }
        if (this.g < 0) {
            return l.size();
        }
        return l.size() - 1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C6287iT1 getItem(int i) {
        ArrayList l;
        boolean z = this.i;
        BS1 bs1 = this.a;
        if (!z) {
            l = bs1.l();
        } else {
            bs1.i();
            l = bs1.j;
        }
        int i2 = this.g;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (C6287iT1) l.get(i);
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.j.inflate(this.k, viewGroup, false);
        }
        int i2 = getItem(i).b;
        int i3 = i - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        boolean z = this.a.m() && i2 != (i3 >= 0 ? getItem(i3).b : i2);
        ImageView imageView = listMenuItemView.m;
        if (imageView != null) {
            imageView.setVisibility((listMenuItemView.t || !z) ? 8 : 0);
        }
        BT1 bt1 = (BT1) view;
        if (this.h) {
            listMenuItemView.v = true;
            listMenuItemView.r = true;
        }
        bt1.c(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }

    public final void a() {
        BS1 bs1 = this.a;
        C6287iT1 c6287iT1 = bs1.v;
        if (c6287iT1 != null) {
            bs1.i();
            ArrayList arrayList = bs1.j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((C6287iT1) arrayList.get(i)) == c6287iT1) {
                    this.g = i;
                    return;
                }
            }
        }
        this.g = -1;
    }
}
