package defpackage;

import J.N;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.text.SpannableString;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.android.chrome.R;
import org.chromium.content.browser.input.TextSuggestionHost;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: up3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractViewOnClickListenerC10533up3 implements AdapterView.OnItemClickListener, PopupWindow.OnDismissListener, View.OnClickListener {
    public final Context a;
    public final TextSuggestionHost g;
    public final View h;
    public WindowAndroid i;
    public Activity j;
    public DisplayMetrics k;
    public PopupWindow l;
    public LinearLayout m;
    public String n;
    public int o;
    public TextView p;
    public TextView q;
    public ListView r;
    public LinearLayout s;
    public View t;
    public int u;
    public boolean v;

    public abstract void a(int i);

    public abstract Object b(int i);

    public abstract SpannableString c(int i);

    public abstract int d();

    public AbstractViewOnClickListenerC10533up3(Context context, TextSuggestionHost textSuggestionHost, WindowAndroid windowAndroid, View view) {
        this.a = context;
        this.g = textSuggestionHost;
        this.i = windowAndroid;
        this.h = view;
        PopupWindow popupWindow = new PopupWindow();
        this.l = popupWindow;
        popupWindow.setWidth(-2);
        this.l.setHeight(-2);
        this.l.setBackgroundDrawable(AbstractC9771sd.c(context.getResources(), R.drawable.f46390_resource_name_obfuscated_res_0x7f09017f, 0));
        this.l.setElevation(context.getResources().getDimensionPixelSize(R.dimen.f41780_resource_name_obfuscated_res_0x7f0807cf));
        this.l.setInputMethodMode(2);
        this.l.setFocusable(true);
        this.l.setClippingEnabled(false);
        this.l.setOnDismissListener(this);
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService("layout_inflater");
        this.m = (LinearLayout) layoutInflater.inflate(R.layout.f61460_resource_name_obfuscated_res_0x7f0e02b6, (ViewGroup) null);
        this.u = context.getResources().getDimensionPixelSize(R.dimen.f41790_resource_name_obfuscated_res_0x7f0807d0);
        ListView listView = (ListView) this.m.findViewById(R.id.suggestionContainer);
        this.r = listView;
        listView.setDivider(null);
        LinearLayout linearLayout = (LinearLayout) layoutInflater.inflate(R.layout.f61480_resource_name_obfuscated_res_0x7f0e02b8, (ViewGroup) null);
        this.s = linearLayout;
        this.r.addFooterView(linearLayout, null, false);
        this.r.setAdapter((ListAdapter) new C10190tp3(this));
        this.r.setOnItemClickListener(this);
        this.t = this.m.findViewById(R.id.divider);
        TextView textView = (TextView) this.m.findViewById(R.id.addToDictionaryButton);
        this.p = textView;
        textView.setOnClickListener(this);
        TextView textView2 = (TextView) this.m.findViewById(R.id.deleteButton);
        this.q = textView2;
        textView2.setOnClickListener(this);
        this.l.setContentView(this.m);
    }

    public final void e(double d, double d2, String str) {
        int i;
        this.o = d();
        this.n = str;
        Activity activity = (Activity) this.i.k().get();
        this.j = activity;
        Context context = this.a;
        if (activity != null) {
            this.k = activity.getResources().getDisplayMetrics();
        } else {
            this.k = context.getResources().getDisplayMetrics();
        }
        Activity activity2 = this.j;
        if (activity2 == null || AbstractC9771sd.f(activity2)) {
            i = 0;
        } else {
            Rect rect = new Rect();
            this.j.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
            i = rect.top;
        }
        this.s.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredHeight = ((((this.k.heightPixels - i) - this.s.getMeasuredHeight()) - (this.u * 2)) - this.m.getPaddingTop()) - this.m.getPaddingBottom();
        int min = Math.min(this.o, measuredHeight > 0 ? measuredHeight / context.getResources().getDimensionPixelSize(R.dimen.f41690_resource_name_obfuscated_res_0x7f0807c6) : 0);
        this.o = min;
        if (min == 0) {
            this.t.setVisibility(8);
        } else {
            this.t.setVisibility(0);
        }
        int paddingRight = this.m.getPaddingRight() + this.m.getPaddingLeft() + AbstractC8540p04.a(this.r.getAdapter(), null);
        this.m.measure(View.MeasureSpec.makeMeasureSpec(paddingRight, 1073741824), View.MeasureSpec.makeMeasureSpec(this.k.heightPixels, Integer.MIN_VALUE));
        this.l.setWidth(paddingRight);
        int measuredWidth = this.m.getMeasuredWidth();
        int measuredHeight2 = this.m.getMeasuredHeight();
        int round = (int) Math.round(d - (measuredWidth / 2.0f));
        int round2 = (int) Math.round(d2);
        int[] iArr = new int[2];
        View view = this.h;
        view.getLocationInWindow(iArr);
        this.l.showAtLocation(view, 0, Math.max(-this.m.getPaddingLeft(), Math.min(this.m.getPaddingRight() + (this.k.widthPixels - measuredWidth), round + iArr[0])), Math.min((round2 + iArr[1]) - this.m.getPaddingTop(), ((this.k.heightPixels - measuredHeight2) - this.m.getPaddingTop()) - this.u));
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        TextView textView = this.p;
        TextSuggestionHost textSuggestionHost = this.g;
        if (view == textView) {
            Intent intent = new Intent("com.android.settings.USER_DICTIONARY_INSERT");
            intent.putExtra("word", this.n);
            intent.setFlags(intent.getFlags() | 268435456);
            this.a.startActivity(intent);
            N.MpJ8AQhr(textSuggestionHost.a, textSuggestionHost, this.n);
            this.v = true;
            this.l.dismiss();
            return;
        }
        if (view == this.q) {
            N.MCBTtv2g(textSuggestionHost.a, textSuggestionHost);
            this.v = true;
            this.l.dismiss();
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        if (i >= this.o) {
            return;
        }
        a(i);
        this.v = true;
        this.l.dismiss();
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        boolean z = this.v;
        TextSuggestionHost textSuggestionHost = this.g;
        if (!z) {
            N.MnvYa0QF(textSuggestionHost.a, textSuggestionHost);
        }
        textSuggestionHost.l = null;
        textSuggestionHost.m = null;
        this.v = false;
    }
}
