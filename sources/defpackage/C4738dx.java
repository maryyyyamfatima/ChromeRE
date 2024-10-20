package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.android.chrome.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: dx, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4738dx implements TC1, AdapterView.OnItemClickListener {
    public final ListView a;
    public final C3801bD1 g;
    public final View h;
    public final LinkedList i;
    public final SC1 j;

    public static C7272lK1 e(int i, int i2, int i3, boolean z) {
        return new C7272lK1(1, f(i, i2, i3, z));
    }

    public static C7272lK1 d(int i, int i2, int i3) {
        return new C7272lK1(1, f(i, i2, i3, true));
    }

    public C4738dx(Context context, C7616mK1 c7616mK1, SC1 sc1) {
        C3801bD1 c3801bD1 = new C3801bD1(c7616mK1);
        this.g = c3801bD1;
        View inflate = LayoutInflater.from(context).inflate(R.layout.f55790_resource_name_obfuscated_res_0x7f0e0041, (ViewGroup) null);
        this.h = inflate;
        ListView listView = (ListView) inflate.findViewById(R.id.app_menu_list);
        this.a = listView;
        listView.setAdapter((ListAdapter) c3801bD1);
        listView.setDivider(null);
        listView.setOnItemClickListener(this);
        this.j = sc1;
        this.i = new LinkedList();
        c3801bD1.a(1, new C2591Ty1(R.layout.f58570_resource_name_obfuscated_res_0x7f0e016c), new TD2() { // from class: cx
            @Override // defpackage.TD2
            public final void d(WD2 wd2, Object obj, Object obj2) {
                PropertyModel propertyModel = (PropertyModel) wd2;
                View view = (View) obj;
                FD2 fd2 = (FD2) obj2;
                TextView textView = (TextView) view.findViewById(R.id.menu_item_text);
                ImageView imageView = (ImageView) view.findViewById(R.id.menu_item_icon);
                ImageView imageView2 = (ImageView) view.findViewById(R.id.menu_item_end_icon);
                ND2 nd2 = AbstractC4144cD1.a;
                if (fd2 == nd2) {
                    textView.setText(propertyModel.h(nd2));
                    return;
                }
                PD2 pd2 = AbstractC4144cD1.b;
                if (fd2 == pd2) {
                    textView.setText((CharSequence) propertyModel.i(pd2));
                    return;
                }
                ND2 nd22 = AbstractC4144cD1.c;
                if (fd2 == nd22 || fd2 == AbstractC4144cD1.d) {
                    int h = propertyModel.h((ID2) fd2);
                    Drawable a = h != 0 ? AbstractC2884Wf.a(view.getContext(), h) : null;
                    if (a != null) {
                        if (fd2 == nd22) {
                            imageView.setImageDrawable(a);
                            textView.setPaddingRelative(view.getResources().getDimensionPixelOffset(R.dimen.f35590_resource_name_obfuscated_res_0x7f0804d4), textView.getPaddingTop(), textView.getPaddingEnd(), textView.getPaddingBottom());
                            imageView.setVisibility(0);
                            imageView2.setVisibility(8);
                            return;
                        }
                        imageView2.setImageDrawable(a);
                        imageView.setVisibility(8);
                        imageView2.setVisibility(0);
                        return;
                    }
                    return;
                }
                if (fd2 == AbstractC4144cD1.e) {
                    return;
                }
                LD2 ld2 = AbstractC4144cD1.f;
                if (fd2 == ld2) {
                    textView.setEnabled(propertyModel.j(ld2));
                    imageView.setEnabled(propertyModel.j(ld2));
                    imageView2.setEnabled(propertyModel.j(ld2));
                    return;
                }
                ND2 nd23 = AbstractC4144cD1.g;
                if (fd2 != nd23) {
                    ID2 id2 = AbstractC4144cD1.h;
                    if (fd2 == id2) {
                        AbstractC9771sd.i(propertyModel.h(id2), textView);
                        return;
                    }
                    HD2 hd2 = AbstractC4144cD1.i;
                    if (fd2 == hd2) {
                        if (propertyModel.j(hd2)) {
                            textView.setMaxLines(1);
                            textView.setEllipsize(TextUtils.TruncateAt.END);
                            return;
                        } else {
                            textView.setEllipsize(null);
                            return;
                        }
                    }
                    return;
                }
                imageView.setImageTintList(Y50.b(view.getContext(), propertyModel.h(nd23)));
                imageView2.setImageTintList(Y50.b(view.getContext(), propertyModel.h(nd23)));
            }
        });
        c3801bD1.a(0, new C2591Ty1(R.layout.f55780_resource_name_obfuscated_res_0x7f0e0040), new C5823h60());
    }

    @Override // defpackage.TC1
    public final View c() {
        return this.h;
    }

    @Override // defpackage.TC1
    public final void a(Runnable runnable) {
        this.i.add(runnable);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.j.b(((C7272lK1) this.g.getItem(i)).b);
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    @Override // defpackage.TC1
    public final int b() {
        return AbstractC8540p04.a(this.g, this.a);
    }

    public static PropertyModel f(int i, int i2, int i3, boolean z) {
        HashMap e = PropertyModel.e(AbstractC4144cD1.j);
        ND2 nd2 = AbstractC4144cD1.a;
        DD2 dd2 = new DD2();
        dd2.a = i;
        e.put(nd2, dd2);
        ND2 nd22 = AbstractC4144cD1.e;
        DD2 dd22 = new DD2();
        dd22.a = i2;
        e.put(nd22, dd22);
        ND2 nd23 = AbstractC4144cD1.c;
        DD2 dd23 = new DD2();
        dd23.a = i3;
        e.put(nd23, dd23);
        LD2 ld2 = AbstractC4144cD1.f;
        AD2 ad2 = new AD2();
        ad2.a = z;
        e.put(ld2, ad2);
        ND2 nd24 = AbstractC4144cD1.g;
        DD2 dd24 = new DD2();
        dd24.a = R.color.f17860_resource_name_obfuscated_res_0x7f07012a;
        e.put(nd24, dd24);
        return new PropertyModel(e);
    }
}
