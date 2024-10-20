package defpackage;

import android.app.Activity;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.chrome.R;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ww0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ViewOnClickListenerC2970Ww0 extends FrameLayout implements InterfaceC1411Kw0, View.OnClickListener {
    public static final /* synthetic */ int n = 0;
    public final C1281Jw0 a;
    public final TextView.OnEditorActionListener g;
    public final TextInputLayout h;
    public final AutoCompleteTextView i;
    public final View j;
    public final ImageView k;
    public int l;
    public boolean m;

    public ViewOnClickListenerC2970Ww0(Activity activity, C1281Jw0 c1281Jw0, C10915vw0 c10915vw0, C11258ww0 c11258ww0, TextWatcher textWatcher) {
        super(activity);
        this.a = c1281Jw0;
        this.g = c10915vw0;
        LayoutInflater.from(activity).inflate(R.layout.f59600_resource_name_obfuscated_res_0x7f0e01f4, (ViewGroup) this, true);
        TextInputLayout textInputLayout = (TextInputLayout) findViewById(R.id.text_input_layout);
        this.h = textInputLayout;
        CharSequence charSequence = c1281Jw0.p;
        if (!TextUtils.isEmpty(c1281Jw0.l)) {
            charSequence = ((Object) charSequence) + "*";
        }
        textInputLayout.o(charSequence);
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) textInputLayout.findViewById(R.id.text_view);
        this.i = autoCompleteTextView;
        autoCompleteTextView.setText(c1281Jw0.s);
        autoCompleteTextView.setContentDescription(charSequence);
        autoCompleteTextView.setOnEditorActionListener(c10915vw0);
        autoCompleteTextView.setOnKeyListener(new View.OnKeyListener() { // from class: Sw0
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                if (i != 23 || keyEvent.getAction() != 1) {
                    return false;
                }
                InputMethodManager inputMethodManager = (InputMethodManager) view.getContext().getSystemService("input_method");
                inputMethodManager.viewClicked(view);
                inputMethodManager.showSoftInput(view, 0);
                return true;
            }
        });
        View findViewById = findViewById(R.id.icons_layer);
        this.j = findViewById;
        findViewById.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC2580Tw0(this));
        if (c1281Jw0.v != null) {
            ImageView imageView = (ImageView) findViewById.findViewById(R.id.action_icon);
            imageView.setImageDrawable(LN3.a(c1281Jw0.x, R.color.f17710_resource_name_obfuscated_res_0x7f070113, activity));
            imageView.setContentDescription(activity.getResources().getString(c1281Jw0.y));
            imageView.setOnClickListener(this);
            imageView.setVisibility(0);
        }
        if (c1281Jw0.k != null) {
            ImageView imageView2 = (ImageView) findViewById.findViewById(R.id.value_icon);
            this.k = imageView2;
            imageView2.setVisibility(0);
        }
        autoCompleteTextView.setOnFocusChangeListener(new ViewOnFocusChangeListenerC2710Uw0(this));
        autoCompleteTextView.addTextChangedListener(new C2840Vw0(this, c1281Jw0));
        ArrayList arrayList = c1281Jw0.h;
        if (arrayList != null && !arrayList.isEmpty()) {
            autoCompleteTextView.setAdapter(new ArrayAdapter(getContext(), android.R.layout.simple_spinner_dropdown_item, c1281Jw0.h));
            autoCompleteTextView.setThreshold(0);
        }
        ArrayList arrayList2 = new ArrayList();
        if (c11258ww0 != null) {
            arrayList2.add(c11258ww0);
        }
        if (c1281Jw0.B != 0) {
            arrayList2.add(new InputFilter.LengthFilter(c1281Jw0.B));
            int i = c1281Jw0.B;
            if (textInputLayout.q != i) {
                if (i > 0) {
                    textInputLayout.q = i;
                } else {
                    textInputLayout.q = -1;
                }
                if (textInputLayout.p && textInputLayout.t != null) {
                    EditText editText = textInputLayout.i;
                    textInputLayout.s(editText == null ? null : editText.getText());
                }
            }
        }
        InputFilter[] inputFilterArr = new InputFilter[arrayList2.size()];
        arrayList2.toArray(inputFilterArr);
        autoCompleteTextView.setFilters(inputFilterArr);
        if (textWatcher != null) {
            autoCompleteTextView.addTextChangedListener(textWatcher);
            textWatcher.afterTextChanged(autoCompleteTextView.getText());
        }
        switch (c1281Jw0.a) {
            case 1:
            case 7:
                autoCompleteTextView.setInputType(3);
                return;
            case 2:
                autoCompleteTextView.setInputType(33);
                return;
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                autoCompleteTextView.setInputType(139377);
                return;
            case 4:
                autoCompleteTextView.setInputType(8289);
                return;
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
            case 6:
                autoCompleteTextView.setInputType(4209);
                return;
            case 8:
                autoCompleteTextView.setInputType(2);
                return;
            default:
                autoCompleteTextView.setInputType(8305);
                return;
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            float y = this.i.getY() + this.h.getY() + r2.getHeight();
            this.j.setTranslationY((y - r1.getHeight()) - r1.getTop());
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            e(true);
        }
    }

    @Override // defpackage.InterfaceC1411Kw0
    public final boolean isValid() {
        return this.a.d();
    }

    @Override // defpackage.InterfaceC1411Kw0
    public final void a() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup != null) {
            viewGroup.requestChildFocus(this, this);
        }
        requestFocus();
        sendAccessibilityEvent(8);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(boolean r6) {
        /*
            r5 = this;
            android.widget.ImageView r0 = r5.k
            if (r0 != 0) goto L5
            return
        L5:
            Jw0 r1 = r5.a
            iG r1 = r1.k
            android.widget.AutoCompleteTextView r2 = r5.i
            android.text.Editable r2 = r2.getText()
            rG r1 = r1.a
            r3 = 0
            if (r2 != 0) goto L18
            r1.getClass()
            goto L2e
        L18:
            java.util.HashMap r1 = r1.g
            org.chromium.chrome.browser.autofill.PersonalDataManager r4 = org.chromium.chrome.browser.autofill.PersonalDataManager.d()
            java.lang.String r2 = r2.toString()
            java.lang.String r2 = r4.b(r2, r3)
            java.lang.Object r1 = r1.get(r2)
            qG r1 = (defpackage.C8968qG) r1
            if (r1 != 0) goto L30
        L2e:
            r1 = r3
            goto L32
        L30:
            int r1 = r1.a
        L32:
            int r2 = r5.l
            if (r2 != r1) goto L39
            if (r6 != 0) goto L39
            return
        L39:
            r5.l = r1
            if (r1 != 0) goto L43
            r6 = 8
            r0.setVisibility(r6)
            goto L53
        L43:
            android.content.Context r6 = r5.getContext()
            int r1 = r5.l
            android.graphics.drawable.Drawable r6 = defpackage.AbstractC2884Wf.a(r6, r1)
            r0.setImageDrawable(r6)
            r0.setVisibility(r3)
        L53:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ViewOnClickListenerC2970Ww0.e(boolean):void");
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.v.run();
    }

    @Override // defpackage.InterfaceC1411Kw0
    public final void c(boolean z) {
        this.h.l(z ? this.a.o : null);
    }

    @Override // defpackage.InterfaceC1411Kw0
    public final void d() {
        this.i.setText(this.a.s);
    }

    @Override // defpackage.InterfaceC1411Kw0
    public final boolean b() {
        return !TextUtils.isEmpty(this.a.l);
    }
}
