package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import com.android.chrome.R;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import org.chromium.components.browser_ui.widget.NumberRollView;
import org.chromium.components.browser_ui.widget.selectable_list.SelectableListLayout;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: c33, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractViewOnClickListenerC4089c33 extends Toolbar implements InterfaceC7182l33, View.OnClickListener, TextView.OnEditorActionListener, InterfaceC5041eq0 {
    public int A0;
    public boolean W;
    public C7526m33 a0;
    public boolean b0;
    public boolean c0;
    public LinearLayout d0;
    public EditText e0;
    public ImageButton f0;
    public InterfaceC3746b33 g0;
    public boolean h0;
    public NumberRollView i0;
    public Drawable j0;
    public int k0;
    public int l0;
    public int m0;
    public int n0;
    public int o0;
    public int p0;
    public int q0;
    public ColorStateList r0;
    public QZ3 s0;
    public int t0;
    public int u0;
    public int v0;
    public int w0;
    public boolean x0;
    public boolean y0;
    public int z0;

    public final void U(int i) {
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 3) {
            return false;
        }
        C11939yv1.g.d(textView);
        return false;
    }

    public AbstractViewOnClickListenerC4089c33(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void J(C7526m33 c7526m33, int i, int i2, int i3, boolean z) {
        this.l0 = i;
        this.o0 = i2;
        this.p0 = i3;
        this.a0 = c7526m33;
        c7526m33.a(this);
        this.u0 = getResources().getDimensionPixelSize(R.dimen.f40030_resource_name_obfuscated_res_0x7f080717);
        this.v0 = getResources().getDimensionPixelSize(R.dimen.f40000_resource_name_obfuscated_res_0x7f080714);
        this.w0 = getResources().getDimensionPixelSize(R.dimen.f40010_resource_name_obfuscated_res_0x7f080715);
        int a = AbstractC10957w33.a(getContext());
        this.q0 = a;
        setBackgroundColor(a);
        this.r0 = Y50.b(getContext(), R.color.f17870_resource_name_obfuscated_res_0x7f07012b);
        Context context = getContext();
        this.q = R.style.f101600_resource_name_obfuscated_res_0x7f1503dd;
        C10475ug c10475ug = this.g;
        if (c10475ug != null) {
            c10475ug.setTextAppearance(context, R.style.f101600_resource_name_obfuscated_res_0x7f1503dd);
        }
        int i4 = this.l0;
        if (i4 != 0) {
            F(i4);
        }
        Drawable e = AbstractC8540p04.e(R.drawable.f48410_resource_name_obfuscated_res_0x7f09025e, R.color.f17860_resource_name_obfuscated_res_0x7f07012a, getContext());
        e();
        ActionMenuView actionMenuView = this.a;
        actionMenuView.l();
        C4097c5 c4097c5 = actionMenuView.y;
        Z4 z4 = c4097c5.n;
        if (z4 != null) {
            z4.setImageDrawable(e);
        } else {
            c4097c5.p = true;
            c4097c5.o = e;
        }
        this.j0 = AbstractC8540p04.e(R.drawable.f46950_resource_name_obfuscated_res_0x7f0901bf, R.color.f17870_resource_name_obfuscated_res_0x7f07012b, getContext());
        this.y0 = true;
        this.z0 = R.string.f86770_resource_name_obfuscated_res_0x7f140a41;
        this.A0 = R.string.f74470_resource_name_obfuscated_res_0x7f1404f9;
    }

    public void K(InterfaceC3746b33 interfaceC3746b33, int i, int i2) {
        this.c0 = true;
        this.g0 = interfaceC3746b33;
        this.m0 = i2;
        LayoutInflater.from(getContext()).inflate(R.layout.f60570_resource_name_obfuscated_res_0x7f0e025b, this);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.search_view);
        this.d0 = linearLayout;
        EditText editText = (EditText) linearLayout.findViewById(R.id.search_text);
        this.e0 = editText;
        editText.setHint(i);
        this.e0.setOnEditorActionListener(this);
        this.e0.addTextChangedListener(new C3402a33(this));
        ImageButton imageButton = (ImageButton) findViewById(R.id.clear_text_button);
        this.f0 = imageButton;
        imageButton.setOnClickListener(new View.OnClickListener() { // from class: Z23
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AbstractViewOnClickListenerC4089c33.this.e0.setText("");
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        LayoutInflater.from(getContext()).inflate(R.layout.f59170_resource_name_obfuscated_res_0x7f0e01c8, this);
        NumberRollView numberRollView = (NumberRollView) findViewById(R.id.selection_mode_number);
        this.i0 = numberRollView;
        numberRollView.j = R.plurals.f62740_resource_name_obfuscated_res_0x7f120035;
        numberRollView.k = R.string.f85930_resource_name_obfuscated_res_0x7f1409ea;
    }

    @Override // defpackage.InterfaceC7182l33
    public void d(ArrayList arrayList) {
        boolean z = this.W;
        this.W = this.a0.e();
        if (this.i0 == null) {
            this.i0 = (NumberRollView) findViewById(R.id.selection_mode_number);
        }
        if (this.W) {
            R(arrayList, z);
        } else if (this.b0) {
            Q();
        } else {
            O();
        }
        if (this.W) {
            announceForAccessibility(getContext().getString(z ? R.string.f66750_resource_name_obfuscated_res_0x7f140195 : R.string.f66760_resource_name_obfuscated_res_0x7f140196, Integer.toString(arrayList.size())));
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i;
        if (this.x0 || (i = this.k0) == 0) {
            return;
        }
        if (i == 1) {
            L();
        } else {
            if (i != 2) {
                return;
            }
            this.a0.b();
        }
    }

    public void L() {
        if (this.c0 && this.b0) {
            I();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void M(int r2) {
        /*
            r1 = this;
            r1.k0 = r2
            r1.D(r1)
            int r2 = r1.k0
            if (r2 == 0) goto L26
            r0 = 1
            if (r2 == r0) goto L1b
            r0 = 2
            if (r2 == r0) goto L10
            goto L26
        L10:
            android.graphics.drawable.Drawable r2 = r1.j0
            android.content.res.ColorStateList r0 = r1.r0
            r2.setTintList(r0)
            r2 = 2132017441(0x7f140121, float:1.967316E38)
            goto L27
        L1b:
            android.graphics.drawable.Drawable r2 = r1.j0
            android.content.res.ColorStateList r0 = r1.r0
            r2.setTintList(r0)
            r2 = 2132017544(0x7f140188, float:1.967337E38)
            goto L27
        L26:
            r2 = 0
        L27:
            if (r2 != 0) goto L2b
            r0 = 0
            goto L2d
        L2b:
            android.graphics.drawable.Drawable r0 = r1.j0
        L2d:
            r1.C(r0)
            r1.A(r2)
            QZ3 r2 = r1.s0
            if (r2 == 0) goto L3c
            PZ3 r2 = r2.a
            r1.a(r2)
        L3c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractViewOnClickListenerC4089c33.M(int):void");
    }

    public final void P() {
        this.b0 = true;
        this.a0.b();
        Q();
        this.e0.requestFocus();
        C11939yv1.g.i(this.e0);
        G(null);
    }

    public final void I() {
        if (this.b0) {
            this.b0 = false;
            this.e0.setText("");
            C11939yv1.g.d(this.e0);
            O();
            this.g0.i();
        }
    }

    public void N(boolean z) {
        if (this.c0) {
            this.h0 = z;
            T();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.x0) {
            return;
        }
        this.a0.b();
        if (this.b0) {
            I();
        }
    }

    @Override // defpackage.InterfaceC5041eq0
    public final void a(PZ3 pz3) {
        int e = SelectableListLayout.e(pz3, getResources());
        boolean z = this.b0 && !this.W;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
        int i = pz3.a;
        int i2 = (i != 2 || this.b0 || this.W || this.k0 != 0) ? 0 : this.t0;
        if (i == 2 && z) {
            marginLayoutParams.setMargins(e, marginLayoutParams.topMargin, e, marginLayoutParams.bottomMargin);
            e = 0;
        } else {
            marginLayoutParams.setMargins(0, marginLayoutParams.topMargin, 0, marginLayoutParams.bottomMargin);
        }
        setLayoutParams(marginLayoutParams);
        int i3 = this.k0 != 0 ? this.u0 : 0;
        int i4 = this.W ? this.v0 : this.w0;
        int i5 = i2 + e + i3;
        int paddingTop = getPaddingTop();
        int i6 = e + i4;
        int paddingBottom = getPaddingBottom();
        WeakHashMap weakHashMap = Ec4.a;
        setPaddingRelative(i5, paddingTop, i6, paddingBottom);
    }

    public void O() {
        r();
        o().setGroupVisible(this.o0, true);
        o().setGroupVisible(this.p0, false);
        if (this.c0) {
            this.d0.setVisibility(8);
            T();
        }
        M(0);
        setBackgroundColor(this.q0);
        int i = this.l0;
        if (i != 0) {
            F(i);
        }
        this.i0.setVisibility(8);
        this.i0.a(0, false);
        QZ3 qz3 = this.s0;
        if (qz3 != null) {
            a(qz3.a);
        }
    }

    public void R(List list, boolean z) {
        o().setGroupVisible(this.o0, false);
        o().setGroupVisible(this.p0, true);
        o().setGroupEnabled(this.p0, !list.isEmpty());
        if (this.c0) {
            this.d0.setVisibility(8);
        }
        M(2);
        setBackgroundColor(this.q0);
        G(null);
        this.i0.setVisibility(0);
        if (!z) {
            this.i0.a(0, false);
        }
        this.i0.a(list.size(), true);
        if (this.b0) {
            C11939yv1.g.d(this.e0);
        }
        QZ3 qz3 = this.s0;
        if (qz3 != null) {
            a(qz3.a);
        }
    }

    public final void Q() {
        o().setGroupVisible(this.o0, false);
        o().setGroupVisible(this.p0, false);
        this.i0.setVisibility(8);
        this.d0.setVisibility(0);
        M(1);
        setBackgroundResource(R.drawable.f53160_resource_name_obfuscated_res_0x7f090480);
        QZ3 qz3 = this.s0;
        if (qz3 != null) {
            a(qz3.a);
        }
    }

    public final void T() {
        MenuItem findItem;
        if (this.c0 && (findItem = o().findItem(this.m0)) != null) {
            findItem.setVisible((!this.h0 || this.W || this.b0) ? false : true);
        }
    }

    public final void S(boolean z, boolean z2) {
        MenuItem findItem = o().findItem(this.n0);
        if (findItem != null) {
            if (this.y0) {
                findItem.setIcon(LN3.a(R.drawable.f45060_resource_name_obfuscated_res_0x7f0900c9, z2 ? R.color.f17710_resource_name_obfuscated_res_0x7f070113 : R.color.f17860_resource_name_obfuscated_res_0x7f07012a, getContext()));
            }
            findItem.setTitle(z2 ? this.A0 : this.z0);
            findItem.setVisible(z);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public final void G(CharSequence charSequence) {
        super.G(charSequence);
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof TextView) {
                childAt.setFocusable(true);
                if (!(childAt instanceof Button)) {
                    childAt.setFocusableInTouchMode(true);
                }
            }
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        super.setBackgroundColor(i);
        U(i);
    }
}
