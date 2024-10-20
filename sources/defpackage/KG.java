package defpackage;

import J.N;
import android.app.Activity;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableString;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.android.chrome.R;
import java.util.WeakHashMap;
import org.chromium.chrome.browser.autofill.CardUnmaskBridge;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class KG implements TextWatcher, View.OnClickListener, InterfaceC3906bY1 {
    public int A;
    public int B;
    public ZX1 C;
    public Activity D;
    public boolean E;
    public boolean F;
    public boolean G;
    public final CardUnmaskBridge a;
    public PropertyModel g;
    public boolean h;
    public final View i;
    public final TextView j;
    public final TextView k;
    public final TextView l;
    public final EditText m;
    public final EditText n;
    public final EditText o;
    public final View p;
    public final TextView q;
    public final TextView r;
    public final CheckBox s;
    public final ViewGroup t;
    public final View u;
    public final ProgressBar v;
    public final TextView w;
    public final long x;
    public final int y;
    public final boolean z;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public KG(Activity activity, CardUnmaskBridge cardUnmaskBridge, String str, String str2, String str3, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, long j) {
        this.a = cardUnmaskBridge;
        this.y = i2;
        this.z = z;
        String str4 = null;
        View inflate = LayoutInflater.from(activity).inflate(R.layout.f55880_resource_name_obfuscated_res_0x7f0e004a, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(R.id.instructions);
        this.j = textView;
        textView.setText(str2);
        TextView textView2 = (TextView) inflate.findViewById(R.id.title);
        this.k = textView2;
        this.i = inflate;
        this.l = (TextView) inflate.findViewById(R.id.no_retry_error_message);
        EditText editText = (EditText) inflate.findViewById(R.id.card_unmask_input);
        this.m = editText;
        EditText editText2 = (EditText) inflate.findViewById(R.id.expiration_month);
        this.n = editText2;
        EditText editText3 = (EditText) inflate.findViewById(R.id.expiration_year);
        this.o = editText3;
        this.p = inflate.findViewById(R.id.expiration_container);
        TextView textView3 = (TextView) inflate.findViewById(R.id.new_card_link);
        this.q = textView3;
        textView3.setOnClickListener(this);
        this.r = (TextView) inflate.findViewById(R.id.error_message);
        CheckBox checkBox = (CheckBox) inflate.findViewById(R.id.use_screenlock_checkbox);
        this.s = checkBox;
        checkBox.setChecked(z4);
        if (!z3) {
            checkBox.setVisibility(8);
            checkBox.setChecked(false);
        }
        this.t = (ViewGroup) inflate.findViewById(R.id.controls_container);
        this.u = inflate.findViewById(R.id.verification_overlay);
        this.v = (ProgressBar) inflate.findViewById(R.id.verification_progress_bar);
        this.w = (TextView) inflate.findViewById(R.id.verification_message);
        this.x = j;
        ((ImageView) inflate.findViewById(R.id.cvc_hint_image)).setImageResource(i);
        Resources resources = activity.getResources();
        if (z) {
            textView2.setVisibility(8);
            str4 = str;
        } else {
            g(activity, str);
        }
        BD2 bd2 = new BD2(AbstractC4249cY1.B);
        bd2.e(AbstractC4249cY1.a, this);
        bd2.e(AbstractC4249cY1.h, inflate);
        bd2.e(AbstractC4249cY1.j, str3);
        bd2.d(AbstractC4249cY1.n, resources, R.string.f69890_resource_name_obfuscated_res_0x7f1402f4);
        if (str4 != null) {
            bd2.e(AbstractC4249cY1.c, str4);
        }
        this.g = bd2.a();
        this.h = z2;
        this.A = -1;
        this.B = -1;
        if (z2) {
            new JG(this).c(AbstractC0185Bl.e);
        }
        editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(N.Mu0etYO0(cardUnmaskBridge.a, cardUnmaskBridge))});
        editText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: DG
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView4, int i3, KeyEvent keyEvent) {
                KG kg = KG.this;
                if (i3 != 6) {
                    kg.getClass();
                    return false;
                }
                if (!kg.g.j(AbstractC4249cY1.m)) {
                    kg.c(0, kg.g);
                }
                return true;
            }
        });
        editText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: EG
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z5) {
                KG kg = KG.this;
                kg.G = true;
                kg.h();
            }
        });
        editText2.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: FG
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z5) {
                KG kg = KG.this;
                kg.E = true;
                kg.h();
            }
        });
        editText3.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: GG
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z5) {
                KG kg = KG.this;
                kg.F = true;
                kg.h();
            }
        });
    }

    public final void g(Activity activity, String str) {
        Drawable drawable = activity.getDrawable(this.y);
        SpannableString spannableString = new SpannableString(AbstractC4809e90.a("   ", str));
        TextView textView = this.k;
        float textSize = textView.getTextSize() / drawable.getIntrinsicHeight();
        drawable.setBounds(0, 0, (int) (drawable.getIntrinsicWidth() * textSize), (int) (textSize * drawable.getIntrinsicHeight()));
        spannableString.setSpan(new ImageSpan(drawable, 2), 0, 1, 17);
        textView.setText(spannableString, TextView.BufferType.SPANNABLE);
    }

    public final void b() {
        TextView textView = this.r;
        textView.setText((CharSequence) null);
        textView.setVisibility(8);
        AbstractC1774Nr.g(7, this.D, this.n, this.o, this.m);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        h();
    }

    public final void f() {
        if (this.h) {
            View view = this.p;
            if (view.getVisibility() == 0) {
                return;
            }
            view.setVisibility(0);
            this.m.setEms(3);
            this.n.addTextChangedListener(this);
            this.o.addTextChangedListener(this);
        }
    }

    public final void d() {
        InputMethodManager inputMethodManager = (InputMethodManager) this.D.getSystemService("input_method");
        EditText editText = this.h ? this.n : this.m;
        editText.requestFocus();
        inputMethodManager.showSoftInput(editText, 1);
        editText.sendAccessibilityEvent(8);
    }

    @Override // defpackage.InterfaceC3906bY1
    public final void a(int i) {
        CardUnmaskBridge cardUnmaskBridge = this.a;
        N.Mek0Fv7c(cardUnmaskBridge.a, cardUnmaskBridge);
        this.g = null;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        CardUnmaskBridge cardUnmaskBridge = this.a;
        N.Mxa$aTDN(cardUnmaskBridge.a, cardUnmaskBridge);
        this.q.setVisibility(8);
        this.m.setText((CharSequence) null);
        b();
        this.n.requestFocus();
    }

    public final void h() {
        boolean z = this.h;
        EditText editText = this.o;
        EditText editText2 = this.n;
        int a = z ? AbstractC1774Nr.a(editText2, editText, this.E, this.F) : 7;
        EditText editText3 = this.m;
        String obj = editText3.getText().toString();
        CardUnmaskBridge cardUnmaskBridge = this.a;
        if (!N.MRcUBmjo(cardUnmaskBridge.a, cardUnmaskBridge, obj)) {
            if (this.G && !editText3.isFocused()) {
                a = (a == 7 || a == 6) ? 4 : 5;
            } else if (a == 7) {
                a = 6;
            }
        }
        this.g.k(AbstractC4249cY1.m, a != 7);
        AbstractC1774Nr.f(a, this.D, this.r);
        AbstractC1774Nr.g(a, this.D, editText2, editText, editText3);
        if (a == 6) {
            if (editText2.isFocused() && editText2.getText().length() == 2) {
                if (editText.getText().length() == 2) {
                    editText3.requestFocus();
                    this.G = true;
                    return;
                } else {
                    editText.requestFocus();
                    this.F = true;
                    return;
                }
            }
            if (editText.isFocused() && editText.getText().length() == 2) {
                editText3.requestFocus();
                this.G = true;
            }
        }
    }

    public final void e(int i) {
        View view = this.u;
        view.setVisibility(i);
        ViewGroup viewGroup = this.t;
        viewGroup.setAlpha(1.0f);
        boolean z = i == 8;
        if (!z) {
            view.setAlpha(0.0f);
            long j = 250;
            view.animate().alpha(1.0f).setDuration(j);
            viewGroup.animate().alpha(0.0f).setDuration(j);
        }
        int i2 = z ? 0 : 4;
        WeakHashMap weakHashMap = Ec4.a;
        viewGroup.setImportantForAccessibility(i2);
        viewGroup.setDescendantFocusability(z ? 131072 : 393216);
    }

    @Override // defpackage.InterfaceC3906bY1
    public final void c(int i, PropertyModel propertyModel) {
        if (i != 0) {
            if (i == 1) {
                this.C.c(2, propertyModel);
            }
        } else {
            String obj = this.m.getText().toString();
            String obj2 = this.n.getText().toString();
            String num = Integer.toString(AbstractC1774Nr.b(this.o));
            boolean isChecked = this.s.isChecked();
            CardUnmaskBridge cardUnmaskBridge = this.a;
            N.McBOMUil(cardUnmaskBridge.a, cardUnmaskBridge, obj, obj2, num, isChecked);
        }
    }
}
