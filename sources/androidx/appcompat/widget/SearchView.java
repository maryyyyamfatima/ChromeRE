package androidx.appcompat.widget;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import androidx.customview.view.AbsSavedState;
import com.android.chrome.R;
import defpackage.AbstractC3878bS3;
import defpackage.B23;
import defpackage.C3600af;
import defpackage.Ec4;
import defpackage.H03;
import defpackage.I03;
import defpackage.IN3;
import defpackage.J03;
import defpackage.JG2;
import defpackage.K03;
import defpackage.L03;
import defpackage.M03;
import defpackage.MB1;
import defpackage.N03;
import defpackage.O03;
import defpackage.OV;
import defpackage.P03;
import defpackage.Q03;
import defpackage.S03;
import defpackage.T03;
import defpackage.U03;
import defpackage.V03;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import org.chromium.chrome.browser.language.settings.SelectLanguageFragment;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class SearchView extends MB1 implements OV {
    public static final T03 b0;
    public final ImageView A;
    public final ImageView B;
    public final View C;
    public V03 D;
    public final Rect E;
    public final Rect F;
    public final int[] G;
    public final int[] H;
    public final ImageView I;

    /* renamed from: J, reason: collision with root package name */
    public final Drawable f11481J;
    public final CharSequence K;
    public S03 L;
    public B23 M;
    public View.OnClickListener N;
    public boolean O;
    public boolean P;
    public final CharSequence Q;
    public boolean R;
    public int S;
    public String T;
    public boolean U;
    public int V;
    public final I03 W;
    public final J03 a0;
    public final SearchAutoComplete u;
    public final View v;
    public final View w;
    public final View x;
    public final ImageView y;
    public final ImageView z;

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes.dex */
    class SavedState extends AbsSavedState {
        public static final Parcelable.Creator CREATOR = new b();
        public boolean h;

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.a, i);
            parcel.writeValue(Boolean.valueOf(this.h));
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.h = ((Boolean) parcel.readValue(null)).booleanValue();
        }

        public final String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.h + "}";
        }
    }

    static {
        b0 = Build.VERSION.SDK_INT < 29 ? new T03() : null;
    }

    public SearchView(Context context) {
        this(context, null);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.f12060_resource_name_obfuscated_res_0x7f0503e3);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.E = new Rect();
        this.F = new Rect();
        this.G = new int[2];
        this.H = new int[2];
        this.W = new I03(this);
        this.a0 = new J03(this);
        new WeakHashMap();
        M03 m03 = new M03(this);
        N03 n03 = new N03(this);
        O03 o03 = new O03(this);
        P03 p03 = new P03(this);
        Q03 q03 = new Q03(this);
        H03 h03 = new H03(this);
        int[] iArr = JG2.J0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        IN3 in3 = new IN3(context, obtainStyledAttributes);
        Ec4.l(this, context, iArr, attributeSet, obtainStyledAttributes, i, 0);
        LayoutInflater.from(context).inflate(in3.i(9, R.layout.f55390_resource_name_obfuscated_res_0x7f0e0019), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(R.id.search_src_text);
        this.u = searchAutoComplete;
        searchAutoComplete.k = this;
        this.v = findViewById(R.id.search_edit_frame);
        View findViewById = findViewById(R.id.search_plate);
        this.w = findViewById;
        View findViewById2 = findViewById(R.id.submit_area);
        this.x = findViewById2;
        ImageView imageView = (ImageView) findViewById(R.id.search_button);
        this.y = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.search_go_btn);
        this.z = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.search_close_btn);
        this.A = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.search_voice_btn);
        this.B = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R.id.search_mag_icon);
        this.I = imageView5;
        findViewById.setBackground(in3.e(10));
        findViewById2.setBackground(in3.e(14));
        imageView.setImageDrawable(in3.e(13));
        imageView2.setImageDrawable(in3.e(7));
        imageView3.setImageDrawable(in3.e(4));
        imageView4.setImageDrawable(in3.e(16));
        imageView5.setImageDrawable(in3.e(13));
        this.f11481J = in3.e(12);
        AbstractC3878bS3.a(getResources().getString(R.string.f65550_resource_name_obfuscated_res_0x7f140115), imageView);
        in3.i(15, R.layout.f55380_resource_name_obfuscated_res_0x7f0e0018);
        in3.i(5, 0);
        imageView.setOnClickListener(m03);
        imageView3.setOnClickListener(m03);
        imageView2.setOnClickListener(m03);
        imageView4.setOnClickListener(m03);
        searchAutoComplete.setOnClickListener(m03);
        searchAutoComplete.addTextChangedListener(h03);
        searchAutoComplete.setOnEditorActionListener(o03);
        searchAutoComplete.setOnItemClickListener(p03);
        searchAutoComplete.setOnItemSelectedListener(q03);
        searchAutoComplete.setOnKeyListener(n03);
        searchAutoComplete.setOnFocusChangeListener(new K03(this));
        boolean a = in3.a(8, true);
        if (this.O != a) {
            this.O = a;
            r(a);
            q();
        }
        int d = in3.d(1, -1);
        if (d != -1) {
            this.S = d;
            requestLayout();
        }
        this.K = in3.k(6);
        this.Q = in3.k(11);
        int h = in3.h(3, -1);
        if (h != -1) {
            searchAutoComplete.setImeOptions(h);
        }
        int h2 = in3.h(2, -1);
        if (h2 != -1) {
            searchAutoComplete.setInputType(h2);
        }
        setFocusable(in3.a(0, true));
        in3.n();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        new Intent("android.speech.action.RECOGNIZE_SPEECH").addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.C = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new L03(this));
        }
        r(this.O);
        q();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        if (this.R || !isFocusable()) {
            return false;
        }
        if (!this.P) {
            boolean requestFocus = this.u.requestFocus(i, rect);
            if (requestFocus) {
                r(false);
            }
            return requestFocus;
        }
        return super.requestFocus(i, rect);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        this.R = true;
        super.clearFocus();
        SearchAutoComplete searchAutoComplete = this.u;
        searchAutoComplete.clearFocus();
        searchAutoComplete.b(false);
        this.R = false;
    }

    public final void n(CharSequence charSequence) {
        SearchAutoComplete searchAutoComplete = this.u;
        searchAutoComplete.setText(charSequence);
        if (charSequence != null) {
            searchAutoComplete.setSelection(searchAutoComplete.length());
        }
    }

    public final void q() {
        Drawable drawable;
        CharSequence charSequence = this.Q;
        if (charSequence == null) {
            charSequence = this.K;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        boolean z = this.O;
        SearchAutoComplete searchAutoComplete = this.u;
        if (z && (drawable = this.f11481J) != null) {
            int textSize = (int) (searchAutoComplete.getTextSize() * 1.25d);
            drawable.setBounds(0, 0, textSize, textSize);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(drawable), 1, 2, 33);
            spannableStringBuilder.append(charSequence);
            charSequence = spannableStringBuilder;
        }
        searchAutoComplete.setHint(charSequence);
    }

    @Override // defpackage.MB1, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        if (this.P) {
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            int i4 = this.S;
            size = i4 > 0 ? Math.min(i4, size) : Math.min(getContext().getResources().getDimensionPixelSize(R.dimen.f27670_resource_name_obfuscated_res_0x7f080037), size);
        } else if (mode == 0) {
            size = this.S;
            if (size <= 0) {
                size = getContext().getResources().getDimensionPixelSize(R.dimen.f27670_resource_name_obfuscated_res_0x7f080037);
            }
        } else if (mode == 1073741824 && (i3 = this.S) > 0) {
            size = Math.min(i3, size);
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getContext().getResources().getDimensionPixelSize(R.dimen.f27660_resource_name_obfuscated_res_0x7f080036), size2);
        } else if (mode2 == 0) {
            size2 = getContext().getResources().getDimensionPixelSize(R.dimen.f27660_resource_name_obfuscated_res_0x7f080036);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // defpackage.MB1, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            SearchAutoComplete searchAutoComplete = this.u;
            int[] iArr = this.G;
            searchAutoComplete.getLocationInWindow(iArr);
            int[] iArr2 = this.H;
            getLocationInWindow(iArr2);
            int i5 = iArr[1] - iArr2[1];
            int i6 = iArr[0] - iArr2[0];
            int width = searchAutoComplete.getWidth() + i6;
            int height = searchAutoComplete.getHeight() + i5;
            Rect rect = this.E;
            rect.set(i6, i5, width, height);
            int i7 = rect.left;
            int i8 = rect.right;
            int i9 = i4 - i2;
            Rect rect2 = this.F;
            rect2.set(i7, 0, i8, i9);
            V03 v03 = this.D;
            if (v03 == null) {
                V03 v032 = new V03(rect2, rect, searchAutoComplete);
                this.D = v032;
                setTouchDelegate(v032);
            } else {
                v03.b.set(rect2);
                Rect rect3 = v03.d;
                rect3.set(rect2);
                int i10 = -v03.e;
                rect3.inset(i10, i10);
                v03.c.set(rect);
            }
        }
    }

    public final void r(boolean z) {
        this.P = z;
        int i = z ? 0 : 8;
        TextUtils.isEmpty(this.u.getText());
        this.y.setVisibility(i);
        this.z.setVisibility(8);
        this.v.setVisibility(z ? 8 : 0);
        ImageView imageView = this.I;
        imageView.setVisibility((imageView.getDrawable() == null || this.O) ? 8 : 0);
        o();
        this.B.setVisibility(8);
        this.x.setVisibility(8);
    }

    public final void o() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.u.getText());
        if (!z2 && (!this.O || this.U)) {
            z = false;
        }
        int i = z ? 0 : 8;
        ImageView imageView = this.A;
        imageView.setVisibility(i);
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            drawable.setState(z2 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    public final void p() {
        int[] iArr = this.u.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.w.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.x.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.W);
        post(this.a0);
        super.onDetachedFromWindow();
    }

    public final void m() {
        SearchAutoComplete searchAutoComplete = this.u;
        Editable text = searchAutoComplete.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        S03 s03 = this.L;
        if (s03 != null) {
            text.toString();
            s03.a();
        } else {
            searchAutoComplete.b(false);
            searchAutoComplete.dismissDropDown();
        }
    }

    public final void l() {
        SearchAutoComplete searchAutoComplete = this.u;
        if (TextUtils.isEmpty(searchAutoComplete.getText())) {
            if (this.O) {
                B23 b23 = this.M;
                if (b23 != null) {
                    SelectLanguageFragment selectLanguageFragment = b23.a;
                    selectLanguageFragment.c0 = "";
                    selectLanguageFragment.e0.R(selectLanguageFragment.f0);
                }
                clearFocus();
                r(true);
                return;
            }
            return;
        }
        searchAutoComplete.setText("");
        searchAutoComplete.requestFocus();
        searchAutoComplete.b(true);
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        post(this.W);
    }

    @Override // defpackage.OV
    public final void onActionViewCollapsed() {
        n("");
        clearFocus();
        r(true);
        this.u.setImeOptions(this.V);
        this.U = false;
    }

    @Override // defpackage.OV
    public final void onActionViewExpanded() {
        if (this.U) {
            return;
        }
        this.U = true;
        SearchAutoComplete searchAutoComplete = this.u;
        int imeOptions = searchAutoComplete.getImeOptions();
        this.V = imeOptions;
        searchAutoComplete.setImeOptions(imeOptions | 33554432);
        searchAutoComplete.setText("");
        r(false);
        searchAutoComplete.requestFocus();
        searchAutoComplete.b(true);
        View.OnClickListener onClickListener = this.N;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.h = this.P;
        return savedState;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a);
        r(savedState.h);
        requestLayout();
    }

    public final void k() {
        int i = Build.VERSION.SDK_INT;
        SearchAutoComplete searchAutoComplete = this.u;
        if (i < 29) {
            T03 t03 = b0;
            t03.getClass();
            T03.a();
            Method method = t03.a;
            if (method != null) {
                try {
                    method.invoke(searchAutoComplete, new Object[0]);
                } catch (Exception unused) {
                }
            }
            T03.a();
            Method method2 = t03.b;
            if (method2 != null) {
                try {
                    method2.invoke(searchAutoComplete, new Object[0]);
                    return;
                } catch (Exception unused2) {
                    return;
                }
            }
            return;
        }
        searchAutoComplete.refreshAutoCompleteResults();
    }

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes.dex */
    public class SearchAutoComplete extends C3600af {
        public int j;
        public SearchView k;
        public boolean l;
        public final U03 m;

        @Override // android.widget.AutoCompleteTextView
        public final void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public final void replaceText(CharSequence charSequence) {
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.m = new U03(this);
            this.j = getThreshold();
        }

        @Override // android.view.View
        public final void onFinishInflate() {
            super.onFinishInflate();
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            Configuration configuration = getResources().getConfiguration();
            int i = configuration.screenWidthDp;
            int i2 = configuration.screenHeightDp;
            setMinWidth((int) TypedValue.applyDimension(1, (i < 960 || i2 < 720 || configuration.orientation != 2) ? (i >= 600 || (i >= 640 && i2 >= 480)) ? 192 : 160 : 256, displayMetrics));
        }

        @Override // android.widget.AutoCompleteTextView
        public final void setThreshold(int i) {
            super.setThreshold(i);
            this.j = i;
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (z && this.k.hasFocus() && getVisibility() == 0) {
                this.l = true;
                Context context = getContext();
                T03 t03 = SearchView.b0;
                if (context.getResources().getConfiguration().orientation == 2) {
                    if (Build.VERSION.SDK_INT < 29) {
                        T03 t032 = SearchView.b0;
                        t032.getClass();
                        T03.a();
                        Method method = t032.c;
                        if (method != null) {
                            try {
                                method.invoke(this, Boolean.TRUE);
                                return;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        return;
                    }
                    setInputMethodMode(1);
                    if (enoughToFilter()) {
                        showDropDown();
                    }
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            SearchView searchView = this.k;
            searchView.r(searchView.P);
            searchView.post(searchView.W);
            if (searchView.u.hasFocus()) {
                searchView.k();
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final boolean enoughToFilter() {
            return this.j <= 0 || super.enoughToFilter();
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.k.clearFocus();
                        b(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        @Override // defpackage.C3600af, android.widget.TextView, android.view.View
        public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.l) {
                U03 u03 = this.m;
                removeCallbacks(u03);
                post(u03);
            }
            return onCreateInputConnection;
        }

        public final void b(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            U03 u03 = this.m;
            if (!z) {
                this.l = false;
                removeCallbacks(u03);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (inputMethodManager.isActive(this)) {
                    this.l = false;
                    removeCallbacks(u03);
                    inputMethodManager.showSoftInput(this, 0);
                    return;
                }
                this.l = true;
            }
        }
    }
}
