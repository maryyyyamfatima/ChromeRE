package defpackage;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.android.chrome.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Gw0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0891Gw0 implements InterfaceC1411Kw0 {
    public final Context a;
    public final C1281Jw0 g;
    public final View h;
    public final Spinner i;
    public final View j;
    public final TextView k;
    public int l;
    public final C6783ju0 m;

    public C0891Gw0(Activity activity, ViewGroup viewGroup, C1281Jw0 c1281Jw0, RunnableC0111Aw0 runnableC0111Aw0) {
        this.a = activity;
        this.g = c1281Jw0;
        View inflate = LayoutInflater.from(activity).inflate(R.layout.f59560_resource_name_obfuscated_res_0x7f0e01f0, viewGroup, false);
        this.h = inflate;
        ((TextView) inflate.findViewById(R.id.spinner_label)).setText(!TextUtils.isEmpty(c1281Jw0.l) ? ((Object) c1281Jw0.p) + "*" : c1281Jw0.p);
        this.j = inflate.findViewById(R.id.spinner_underline);
        this.k = (TextView) inflate.findViewById(R.id.spinner_error);
        List list = c1281Jw0.d;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            arrayList.add((CharSequence) ((Pair) ((C1021Hw0) list.get(i))).second);
        }
        C1281Jw0 c1281Jw02 = this.g;
        if (c1281Jw02.t == null) {
            C6783ju0 c6783ju0 = new C6783ju0(activity, arrayList, 0);
            this.m = c6783ju0;
            c6783ju0.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        } else {
            if (c1281Jw02.A) {
                this.m = new O71(activity, arrayList, this.g.t.toString());
            } else {
                this.m = new N71(activity, arrayList, this.g.t.toString());
            }
            this.m.setDropDownViewResource(R.layout.f59540_resource_name_obfuscated_res_0x7f0e01ee);
        }
        int position = TextUtils.isEmpty(this.g.s) ? 0 : this.m.getPosition(this.g.s.toString());
        this.l = position;
        if (position < 0) {
            C6783ju0 c6783ju02 = this.m;
            C1281Jw0 c1281Jw03 = this.g;
            this.l = c6783ju02.getPosition((CharSequence) c1281Jw03.e.get(c1281Jw03.s.toString()));
        }
        if (this.l < 0) {
            this.l = 0;
        }
        Spinner spinner = (Spinner) this.h.findViewById(R.id.spinner);
        this.i = spinner;
        spinner.setTag(this);
        spinner.setAdapter((SpinnerAdapter) this.m);
        spinner.setSelection(this.l);
        spinner.setOnItemSelectedListener(new C0631Ew0(this, runnableC0111Aw0));
        spinner.setOnTouchListener(new ViewOnTouchListenerC0761Fw0(this));
    }

    @Override // defpackage.InterfaceC1411Kw0
    public final boolean isValid() {
        return this.g.d();
    }

    @Override // defpackage.InterfaceC1411Kw0
    public final void c(boolean z) {
        View selectedView = this.i.getSelectedView();
        if (selectedView == null || !(selectedView instanceof TextView)) {
            return;
        }
        View view = this.j;
        TextView textView = this.k;
        Context context = this.a;
        if (z) {
            C11674y84 b = C11674y84.b(context.getResources(), R.drawable.f47460_resource_name_obfuscated_res_0x7f0901f7, context.getTheme());
            b.setBounds(0, 0, b.getIntrinsicWidth(), b.getIntrinsicHeight());
            C1281Jw0 c1281Jw0 = this.g;
            ((TextView) selectedView).setError(c1281Jw0.o, b);
            view.setBackgroundColor(context.getColor(R.color.f18050_resource_name_obfuscated_res_0x7f07013d));
            textView.setText(c1281Jw0.o);
            textView.setVisibility(0);
            return;
        }
        ((TextView) selectedView).setError(null);
        view.setBackgroundColor(context.getColor(R.color.f24860_resource_name_obfuscated_res_0x7f0707a9));
        textView.setText((CharSequence) null);
        textView.setVisibility(8);
    }

    @Override // defpackage.InterfaceC1411Kw0
    public final void a() {
        c(!isValid());
        C11939yv1 c11939yv1 = C11939yv1.g;
        Spinner spinner = this.i;
        c11939yv1.d(spinner);
        ViewGroup viewGroup = (ViewGroup) spinner.getParent();
        if (viewGroup != null) {
            viewGroup.requestChildFocus(spinner, spinner);
        }
        spinner.sendAccessibilityEvent(8);
    }

    @Override // defpackage.InterfaceC1411Kw0
    public final void d() {
        int position;
        C1281Jw0 c1281Jw0 = this.g;
        if (TextUtils.isEmpty(c1281Jw0.s)) {
            position = 0;
        } else {
            position = this.m.getPosition((CharSequence) c1281Jw0.e.get(c1281Jw0.s.toString()));
        }
        this.l = position;
        this.i.setSelection(position);
    }

    @Override // defpackage.InterfaceC1411Kw0
    public final boolean b() {
        return !TextUtils.isEmpty(this.g.l);
    }
}
