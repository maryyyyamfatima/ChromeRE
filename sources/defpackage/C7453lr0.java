package defpackage;

import J.N;
import android.R;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import org.chromium.base.Callback;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: lr0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C7453lr0 extends ArrayAdapter {
    public static final /* synthetic */ int m = 0;
    public int a;
    public final Context g;
    public final LayoutInflater h;
    public final InterfaceC7109kr0 i;
    public final ArrayList j;
    public final ArrayList k;
    public final ArrayList l;

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    public C7453lr0(Context context, InterfaceC7109kr0 interfaceC7109kr0) {
        super(context, R.layout.simple_spinner_item);
        this.a = -2;
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.l = new ArrayList();
        this.g = context;
        this.i = interfaceC7109kr0;
        this.h = LayoutInflater.from(context);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final int getCount() {
        return this.l.size() + this.k.size() + this.j.size();
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final Object getItem(int i) {
        ArrayList arrayList = this.l;
        if (!arrayList.isEmpty()) {
            return arrayList.get(i);
        }
        ArrayList arrayList2 = this.j;
        if (i < arrayList2.size()) {
            return arrayList2.get(i);
        }
        return this.k.get(i - arrayList2.size());
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.h.inflate(com.android.chrome.R.layout.f57160_resource_name_obfuscated_res_0x7f0e00dc, (ViewGroup) null);
        }
        view.setTag(Integer.valueOf(i));
        C0461Do0 c0461Do0 = (C0461Do0) getItem(i);
        if (c0461Do0 == null) {
            return view;
        }
        ((TextView) view.findViewById(com.android.chrome.R.id.title)).setText(c0461Do0.a);
        if (view.getLayoutParams() == null) {
            view.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        }
        return view;
    }

    @Override // android.widget.ArrayAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.h.inflate(com.android.chrome.R.layout.f57150_resource_name_obfuscated_res_0x7f0e00db, (ViewGroup) null);
        }
        view.setTag(Integer.valueOf(i));
        C0461Do0 c0461Do0 = (C0461Do0) getItem(i);
        if (c0461Do0 == null) {
            return view;
        }
        TextView textView = (TextView) view.findViewById(com.android.chrome.R.id.title);
        TextView textView2 = (TextView) view.findViewById(com.android.chrome.R.id.description);
        boolean isEnabled = isEnabled(i);
        textView.setText(c0461Do0.a);
        textView.setEnabled(isEnabled);
        textView2.setEnabled(isEnabled);
        Context context = this.g;
        if (isEnabled) {
            textView2.setText(AbstractC6091ht0.c(context, AbstractC11893yn3.a, c0461Do0.c));
        } else if (this.l.isEmpty()) {
            textView2.setText(context.getText(com.android.chrome.R.string.f72520_resource_name_obfuscated_res_0x7f140422));
        } else {
            textView2.setVisibility(8);
        }
        ((ImageView) view.findViewById(com.android.chrome.R.id.start_icon)).setVisibility(8);
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean isEnabled(int i) {
        C0461Do0 c0461Do0 = (C0461Do0) getItem(i);
        return (c0461Do0 == null || c0461Do0.c == 0) ? false : true;
    }

    public final int c() {
        for (int i = 0; i < getCount(); i++) {
            C0461Do0 c0461Do0 = (C0461Do0) getItem(i);
            if (c0461Do0 != null && c0461Do0.c > 0) {
                N.MQzHQbrF(c0461Do0.b);
                this.a = i;
                return i;
            }
        }
        a();
        return 0;
    }

    public final void b() {
        this.j.clear();
        this.k.clear();
        this.l.clear();
        AbstractC8828pr0.a.a(new Callback() { // from class: jr0
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                ArrayList arrayList;
                String string;
                C7453lr0 c7453lr0 = C7453lr0.this;
                c7453lr0.getClass();
                Iterator it = ((ArrayList) obj).iterator();
                int i = 0;
                int i2 = 0;
                while (true) {
                    boolean hasNext = it.hasNext();
                    arrayList = c7453lr0.l;
                    if (!hasNext) {
                        break;
                    }
                    C0461Do0 c0461Do0 = (C0461Do0) ((C0461Do0) it.next()).clone();
                    Context context = c7453lr0.g;
                    int i3 = c0461Do0.e;
                    if (i3 == 0) {
                        c0461Do0.a = context.getString(com.android.chrome.R.string.f77050_resource_name_obfuscated_res_0x7f140621);
                        c7453lr0.j.add(c0461Do0);
                    } else if (i3 == 1) {
                        if (i2 > 0) {
                            string = context.getString(com.android.chrome.R.string.f73060_resource_name_obfuscated_res_0x7f14045a, Integer.valueOf(i2 + 1));
                        } else {
                            string = context.getString(com.android.chrome.R.string.f73050_resource_name_obfuscated_res_0x7f140459);
                        }
                        c0461Do0.a = string;
                        c7453lr0.k.add(c0461Do0);
                        i2++;
                    } else if (i3 == 2) {
                        c0461Do0.a = context.getString(com.android.chrome.R.string.f72490_resource_name_obfuscated_res_0x7f14041f);
                        arrayList.add(c0461Do0);
                    }
                }
                if (arrayList.isEmpty()) {
                    String M4fixBWD = N.M4fixBWD();
                    while (true) {
                        if (i >= c7453lr0.getCount()) {
                            i = -1;
                            break;
                        }
                        C0461Do0 c0461Do02 = (C0461Do0) c7453lr0.getItem(i);
                        if (c0461Do02 != null && M4fixBWD.equals(c0461Do02.b)) {
                            break;
                        } else {
                            i++;
                        }
                    }
                    c7453lr0.a = i;
                }
                c7453lr0.notifyDataSetChanged();
                InterfaceC7109kr0 interfaceC7109kr0 = c7453lr0.i;
                if (interfaceC7109kr0 != null) {
                    interfaceC7109kr0.d();
                }
            }
        });
    }

    public final void a() {
        int size = this.k.size() + this.j.size();
        ArrayList arrayList = this.l;
        if (size > 0) {
            arrayList.clear();
        } else {
            arrayList.add(new C0461Do0(this.g.getString(com.android.chrome.R.string.f72490_resource_name_obfuscated_res_0x7f14041f), null, 0L, 0L, 2));
        }
    }
}
