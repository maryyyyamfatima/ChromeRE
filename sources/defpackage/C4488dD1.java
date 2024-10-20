package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.android.chrome.R;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: dD1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4488dD1 extends BaseAdapter {
    public int a = -1;
    public final /* synthetic */ C4831eD1 g;

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    public C4488dD1(C4831eD1 c4831eD1) {
        this.g = c4831eD1;
        a();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        C4831eD1 c4831eD1 = this.g;
        BS1 bs1 = c4831eD1.h;
        bs1.i();
        int size = bs1.j.size();
        c4831eD1.getClass();
        int i = size + 0;
        return this.a < 0 ? i : i - 1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C6287iT1 getItem(int i) {
        C4831eD1 c4831eD1 = this.g;
        BS1 bs1 = c4831eD1.h;
        bs1.i();
        ArrayList arrayList = bs1.j;
        c4831eD1.getClass();
        int i2 = i + 0;
        int i3 = this.a;
        if (i3 >= 0 && i2 >= i3) {
            i2++;
        }
        return (C6287iT1) arrayList.get(i2);
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.g.g.inflate(R.layout.f55300_resource_name_obfuscated_res_0x7f0e0010, viewGroup, false);
        }
        ((BT1) view).c(getItem(i));
        return view;
    }

    public final void a() {
        BS1 bs1 = this.g.h;
        C6287iT1 c6287iT1 = bs1.v;
        if (c6287iT1 != null) {
            bs1.i();
            ArrayList arrayList = bs1.j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((C6287iT1) arrayList.get(i)) == c6287iT1) {
                    this.a = i;
                    return;
                }
            }
        }
        this.a = -1;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
