package org.chromium.chrome.browser.history;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.chrome.R;
import defpackage.AbstractC10957w33;
import defpackage.AbstractC4433d33;
import defpackage.AbstractC4855eI0;
import defpackage.AbstractC8650pL;
import defpackage.C11674y84;
import defpackage.C1844Of;
import defpackage.C6964kR2;
import defpackage.Ec4;
import defpackage.O81;
import defpackage.Q81;
import defpackage.S23;
import defpackage.VH0;
import defpackage.Y50;
import java.util.WeakHashMap;
import org.chromium.chrome.browser.history.HistoryItemView;
import org.chromium.components.favicon.LargeIconBridge;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class HistoryItemView extends S23 {
    public static final /* synthetic */ int O = 0;
    public C1844Of F;
    public C11674y84 G;
    public final C6964kR2 H;
    public VH0 I;

    /* renamed from: J */
    public final int f11524J;
    public final int K;
    public final int L;
    public boolean M;
    public boolean N;

    @Override // defpackage.U23
    public final void k(Object obj) {
        LargeIconBridge largeIconBridge;
        Q81 q81 = (Q81) obj;
        if (this.i == q81) {
            return;
        }
        super.k(q81);
        TextView textView = this.v;
        String str = q81.e;
        textView.setText(str);
        this.w.setText(q81.d);
        AbstractC4433d33.a(getContext(), this.F, str, 1);
        this.N = false;
        if (Boolean.valueOf(q81.f).booleanValue()) {
            if (this.G == null) {
                this.G = C11674y84.b(getContext().getResources(), R.drawable.0_resource_name_obfuscated_res_0x7f0901c8, getContext().getTheme());
            }
            s(this.G);
            this.v.setTextColor(getContext().getColor(R.color.0_resource_name_obfuscated_res_0x7f07012e));
            return;
        }
        VH0 vh0 = this.I;
        Resources resources = getContext().getResources();
        vh0.getClass();
        s(new BitmapDrawable(resources, vh0.b(resources, q81.c, true)));
        final Q81 q812 = (Q81) this.i;
        if (!Boolean.valueOf(q812.f).booleanValue()) {
            LargeIconBridge.LargeIconCallback largeIconCallback = new LargeIconBridge.LargeIconCallback() { // from class: S81
                @Override // org.chromium.components.favicon.LargeIconBridge.LargeIconCallback
                public final void onLargeIconAvailable(Bitmap bitmap, int i, boolean z, int i2) {
                    int i3 = HistoryItemView.O;
                    HistoryItemView historyItemView = HistoryItemView.this;
                    Object obj2 = historyItemView.i;
                    if (q812 != obj2) {
                        return;
                    }
                    historyItemView.s(AbstractC4855eI0.e(bitmap, ((Q81) obj2).c, i, historyItemView.H, historyItemView.getResources(), historyItemView.K));
                }
            };
            O81 o81 = q812.j;
            if (o81 != null && (largeIconBridge = o81.p) != null) {
                largeIconBridge.b(q812.c, this.f11524J, largeIconCallback);
            }
        }
        this.v.setTextColor(Y50.b(getContext(), R.color.0_resource_name_obfuscated_res_0x7f07014a));
    }

    public HistoryItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11524J = getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f080179);
        this.K = getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f08017a);
        this.H = AbstractC4855eI0.a(context);
        this.L = context.getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f080180);
        this.x = ColorStateList.valueOf(AbstractC10957w33.d(context));
    }

    @Override // defpackage.S23, defpackage.U23, android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.s.setImageResource(R.drawable.0_resource_name_obfuscated_res_0x7f090153);
        C1844Of c1844Of = this.u;
        this.F = c1844Of;
        c1844Of.setImageResource(R.drawable.0_resource_name_obfuscated_res_0x7f0900c7);
        this.F.setContentDescription(getContext().getString(R.string.0_resource_name_obfuscated_res_0x7f140953));
        this.F.setImageTintList(Y50.b(getContext(), R.color.0_resource_name_obfuscated_res_0x7f07012a));
        this.F.setOnClickListener(new View.OnClickListener() { // from class: R81
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = HistoryItemView.O;
                HistoryItemView historyItemView = HistoryItemView.this;
                Object obj = historyItemView.i;
                if (obj == null || historyItemView.N) {
                    return;
                }
                historyItemView.N = true;
                Q81 q81 = (Q81) obj;
                O81 o81 = q81.j;
                if (o81 != null) {
                    C4117c81 c4117c81 = o81.n;
                    c4117c81.W(q81);
                    c4117c81.n.a();
                    o81.o.announceForAccessibility(o81.a.getString(R.string.0_resource_name_obfuscated_res_0x7f1403ed, q81.e));
                    o81.g.k(q81);
                }
            }
        });
        this.F.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.F.setPaddingRelative(getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f08035b), getPaddingTop(), getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f08035b), getPaddingBottom());
        t();
    }

    @Override // defpackage.U23
    public final void j() {
        Q81 q81;
        O81 o81;
        Object obj = this.i;
        if (obj == null || (o81 = (q81 = (Q81) obj).j) == null) {
            return;
        }
        o81.g.n(q81);
        o81.f(q81.c, null, false);
    }

    public final void t() {
        int i;
        if (AbstractC8650pL.a("history.deleting_enabled")) {
            i = this.M ? 0 : 4;
        } else {
            i = 8;
        }
        this.F.setVisibility(i);
        int i2 = i == 8 ? this.L : 0;
        LinearLayout linearLayout = this.r;
        WeakHashMap weakHashMap = Ec4.a;
        linearLayout.setPaddingRelative(linearLayout.getPaddingStart(), this.r.getPaddingTop(), i2, this.r.getPaddingBottom());
    }
}
