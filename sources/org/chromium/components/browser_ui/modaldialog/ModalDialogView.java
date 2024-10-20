package org.chromium.components.browser_ui.modaldialog;

import android.content.Context;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.chrome.R;
import defpackage.AbstractC11746yN;
import org.chromium.base.Callback;
import org.chromium.components.browser_ui.modaldialog.ModalDialogView;
import org.chromium.components.browser_ui.widget.BoundedLinearLayout;
import org.chromium.components.browser_ui.widget.FadingEdgeScrollView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class ModalDialogView extends BoundedLinearLayout implements View.OnClickListener {
    public static final /* synthetic */ int C = 0;
    public ViewGroup A;
    public TextView B;
    public FadingEdgeScrollView k;
    public ViewGroup l;
    public TextView m;
    public ImageView n;
    public TextView o;
    public TextView p;
    public ViewGroup q;
    public ViewGroup r;
    public View s;
    public Button t;
    public Button u;
    public Callback v;
    public boolean w;
    public boolean x;
    public boolean y;
    public Runnable z;

    public ModalDialogView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.k = (FadingEdgeScrollView) findViewById(R.id.modal_dialog_scroll_view);
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.title_container);
        this.l = viewGroup;
        this.m = (TextView) viewGroup.findViewById(R.id.title);
        this.n = (ImageView) this.l.findViewById(R.id.title_icon);
        this.o = (TextView) findViewById(R.id.message_paragraph_1);
        this.p = (TextView) findViewById(R.id.message_paragraph_2);
        this.q = (ViewGroup) findViewById(R.id.custom);
        this.r = (ViewGroup) findViewById(R.id.custom_button_bar);
        this.s = findViewById(R.id.button_bar);
        this.t = (Button) findViewById(R.id.positive_button);
        this.u = (Button) findViewById(R.id.negative_button);
        this.A = (ViewGroup) findViewById(R.id.footer);
        this.B = (TextView) findViewById(R.id.footer_message);
        this.t.setOnClickListener(this);
        this.u.setOnClickListener(this);
        this.o.setMovementMethod(LinkMovementMethod.getInstance());
        this.B.setMovementMethod(LinkMovementMethod.getInstance());
        this.A.setBackgroundColor(AbstractC11746yN.c(getContext(), R.dimen.f30390_resource_name_obfuscated_res_0x7f080171));
        c();
        b();
        this.k.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: dY1
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                int i9 = ModalDialogView.C;
                boolean z = true;
                if (!view.canScrollVertically(-1) && !view.canScrollVertically(1)) {
                    z = false;
                }
                view.setFocusable(z);
            }
        });
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view == this.t) {
            this.v.onResult(0);
        } else if (view == this.u) {
            this.v.onResult(1);
        } else if (view == this.n) {
            this.v.onResult(2);
        }
    }

    public final Button a(int i) {
        if (i == 0) {
            return this.t;
        }
        if (i != 1) {
            return null;
        }
        return this.u;
    }

    public final void c() {
        boolean z = !TextUtils.isEmpty(this.m.getText());
        boolean z2 = this.n.getDrawable() != null;
        boolean z3 = z || z2;
        boolean z4 = !TextUtils.isEmpty(this.o.getText());
        boolean z5 = !TextUtils.isEmpty(this.p.getText());
        boolean z6 = (this.w && z3) || z4 || z5;
        boolean isEmpty = true ^ TextUtils.isEmpty(this.B.getText());
        this.m.setVisibility(z ? 0 : 8);
        this.n.setVisibility(z2 ? 0 : 8);
        this.l.setVisibility(z3 ? 0 : 8);
        this.o.setVisibility(z4 ? 0 : 8);
        this.k.setVisibility(z6 ? 0 : 8);
        this.p.setVisibility(z5 ? 0 : 8);
        this.A.setVisibility(isEmpty ? 0 : 8);
    }

    public final void b() {
        boolean z = !TextUtils.isEmpty(this.t.getText());
        boolean z2 = !TextUtils.isEmpty(this.u.getText());
        boolean z3 = (z || z2) && !(this.r.getVisibility() == 0);
        this.t.setVisibility(z ? 0 : 8);
        this.u.setVisibility(z2 ? 0 : 8);
        this.s.setVisibility(z3 ? 0 : 8);
    }
}
