package defpackage;

import J.N;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.RadioButton;
import android.widget.TextView;
import com.android.chrome.R;
import java.util.ArrayList;
import java.util.List;
import org.chromium.base.ThreadUtils;
import org.chromium.components.browser_ui.settings.SettingsLauncher;
import org.chromium.components.search_engines.TemplateUrl;
import org.chromium.components.search_engines.TemplateUrlService;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class IZ2 extends BaseAdapter implements GG3, HG3, View.OnClickListener {
    public final Context a;
    public final LayoutInflater g;
    public ArrayList h = new ArrayList();
    public ArrayList i = new ArrayList();
    public int j = -1;
    public int k = -1;
    public boolean l;
    public Runnable m;
    public SettingsLauncher n;

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getViewTypeCount() {
        return 2;
    }

    public IZ2(Activity activity) {
        this.a = activity;
        this.g = (LayoutInflater) activity.getSystemService("layout_inflater");
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00ac A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c() {
        /*
            Method dump skipped, instructions count: 348
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.IZ2.c():void");
    }

    public static boolean b(List list, TemplateUrl templateUrl) {
        for (int i = 0; i < list.size(); i++) {
            TemplateUrl templateUrl2 = (TemplateUrl) list.get(i);
            if (templateUrl2.a() == templateUrl.a() && TextUtils.equals(templateUrl2.b(), templateUrl.b()) && TextUtils.equals(templateUrl2.c(), templateUrl.c())) {
                return true;
            }
        }
        return false;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList arrayList = this.h;
        int size = arrayList != null ? 0 + arrayList.size() : 0;
        ArrayList arrayList2 = this.i;
        return (arrayList2 == null || arrayList2.size() == 0) ? size : size + this.i.size() + 1;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        if (i < this.h.size()) {
            return this.h.get(i);
        }
        if (i <= this.h.size()) {
            return null;
        }
        return this.i.get(i - a());
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getItemViewType(int i) {
        return (i != this.h.size() || this.i.size() == 0) ? 0 : 1;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        int itemViewType = getItemViewType(i);
        if (view == null) {
            view = this.g.inflate((itemViewType != 1 || this.i.size() == 0) ? R.layout.0_resource_name_obfuscated_res_0x7f0e0257 : R.layout.0_resource_name_obfuscated_res_0x7f0e0258, (ViewGroup) null);
        }
        if (itemViewType == 1) {
            return view;
        }
        view.setOnClickListener(this);
        view.setTag(Integer.valueOf(i));
        RadioButton radioButton = (RadioButton) view.findViewById(R.id.radiobutton);
        boolean z = i == this.j;
        radioButton.setChecked(z);
        TextView textView = (TextView) view.findViewById(R.id.name);
        this.a.getResources();
        TemplateUrl templateUrl = (TemplateUrl) getItem(i);
        textView.setText(templateUrl.c());
        TextView textView2 = (TextView) view.findViewById(R.id.url);
        textView2.setText(templateUrl.b());
        if (TextUtils.isEmpty(templateUrl.b())) {
            textView2.setVisibility(8);
        }
        radioButton.setImportantForAccessibility(2);
        textView.setAccessibilityDelegate(new HZ2(z));
        return view;
    }

    @Override // defpackage.GG3
    public final void d() {
        TemplateUrlService a = IG3.a();
        a.getClass();
        Object obj = ThreadUtils.a;
        a.a.d(this);
        this.l = false;
        c();
    }

    @Override // defpackage.HG3
    public final void x() {
        c();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String b;
        int intValue = ((Integer) view.getTag()).intValue();
        this.j = intValue;
        if (intValue < this.h.size()) {
            b = ((TemplateUrl) this.h.get(intValue)).b();
        } else {
            b = ((TemplateUrl) this.i.get(intValue - a())).b();
        }
        TemplateUrlService a = IG3.a();
        a.getClass();
        Object obj = ThreadUtils.a;
        N.MxknP4iP(a.c, a, b);
        if (this.j != this.k) {
            FI2.a("SearchEngine_ManualChange");
            this.m.run();
        }
        notifyDataSetChanged();
    }

    public final int a() {
        if (this.i.size() > 0) {
            return this.h.size() + 1;
        }
        return this.h.size();
    }
}
