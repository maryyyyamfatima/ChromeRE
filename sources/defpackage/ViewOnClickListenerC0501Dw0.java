package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Handler;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;
import com.android.chrome.R;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.chromium.chrome.browser.autofill.prefeditor.EditorDialogToolbar;
import org.chromium.chrome.browser.autofill.prefeditor.ExpandableGridView;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.components.browser_ui.widget.FadingEdgeScrollView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Dw0 */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC0501Dw0 extends N8 implements View.OnClickListener, DialogInterface.OnShowListener, DialogInterface.OnDismissListener {
    public static final /* synthetic */ int D = 0;
    public boolean A;
    public final Profile B;
    public QZ3 C;
    public final Activity a;
    public final Handler g;
    public final C10915vw0 h;
    public final int i;
    public final ArrayList j;
    public final ArrayList k;
    public final ArrayList l;
    public final C11258ww0 m;
    public final C0396Db0 n;
    public TextWatcher o;
    public View p;
    public C1930Ow0 q;
    public Button r;
    public boolean s;
    public boolean t;
    public ViewGroup u;
    public View v;
    public AutoCompleteTextView w;
    public AutoCompleteTextView x;
    public Animator y;
    public final Runnable z;

    public ViewOnClickListenerC0501Dw0(Activity activity, RunnableC8140nr runnableC8140nr, Profile profile) {
        super(activity, R.style.f105230_resource_name_obfuscated_res_0x7f150548);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        this.a = activity;
        this.g = new Handler();
        this.A = false;
        this.h = new C10915vw0(this);
        this.i = activity.getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f0801f9);
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.l = new ArrayList();
        this.m = new C11258ww0(Pattern.compile("^[\\d- ]*$"));
        this.n = new C0396Db0();
        this.z = runnableC8140nr;
        this.B = profile;
    }

    public final boolean i() {
        InterfaceC1411Kw0 interfaceC1411Kw0;
        ArrayList c = c(true);
        int i = 0;
        while (true) {
            ArrayList arrayList = this.j;
            if (i >= arrayList.size()) {
                break;
            }
            InterfaceC1411Kw0 interfaceC1411Kw02 = (InterfaceC1411Kw0) arrayList.get(i);
            interfaceC1411Kw02.c(c.contains(interfaceC1411Kw02));
            i++;
        }
        if (!c.isEmpty()) {
            View currentFocus = getCurrentFocus();
            if ((currentFocus instanceof TextView) && currentFocus.getParent() != null && (currentFocus.getParent() instanceof InterfaceC1411Kw0)) {
                interfaceC1411Kw0 = (InterfaceC1411Kw0) currentFocus.getParent();
            } else {
                interfaceC1411Kw0 = (!(currentFocus instanceof Spinner) || currentFocus.getTag() == null) ? null : (InterfaceC1411Kw0) currentFocus.getTag();
            }
            if (c.contains(interfaceC1411Kw0)) {
                interfaceC1411Kw0.a();
            } else {
                ((InterfaceC1411Kw0) c.get(0)).a();
            }
        }
        c.isEmpty();
        return c.isEmpty();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C1930Ow0 c1930Ow0;
        if (this.y != null) {
            return;
        }
        if (view.getId() == R.id.editor_dialog_done_button) {
            if (i()) {
                if (this.t && (c1930Ow0 = this.q) != null) {
                    Runnable runnable = c1930Ow0.d;
                    if (runnable != null) {
                        runnable.run();
                    }
                    c1930Ow0.d = null;
                    c1930Ow0.e = null;
                    this.q = null;
                }
                this.s = true;
                b();
                return;
            }
            return;
        }
        if (view.getId() == R.id.payments_edit_cancel_button) {
            b();
        }
    }

    public final void b() {
        if (this.y == null && isShowing()) {
            if (getCurrentFocus() != null) {
                C11939yv1.g.d(getCurrentFocus());
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.p, (Property<View, Float>) View.TRANSLATION_Y, 0.0f, r0.getHeight());
            View view = this.p;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, view.getAlpha(), 0.0f);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ofFloat, ofFloat2);
            this.y = animatorSet;
            animatorSet.setDuration(195L);
            this.y.setInterpolator(AbstractC8142nr1.d);
            this.y.addListener(new C12287zw0(this));
            this.y.start();
        }
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.A = true;
        C1930Ow0 c1930Ow0 = this.q;
        if (c1930Ow0 != null) {
            if (this.s) {
                Runnable runnable = c1930Ow0.d;
                if (runnable != null) {
                    runnable.run();
                }
                c1930Ow0.d = null;
                c1930Ow0.e = null;
                this.s = false;
            } else {
                Runnable runnable2 = c1930Ow0.e;
                if (runnable2 != null) {
                    runnable2.run();
                }
                c1930Ow0.d = null;
                c1930Ow0.e = null;
            }
            this.q = null;
        }
        g();
    }

    public final void f() {
        TextView textView = (TextView) this.p.findViewById(R.id.required_fields_notice);
        int i = 0;
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.j;
            if (i2 >= arrayList.size()) {
                i = 8;
                break;
            } else if (((InterfaceC1411Kw0) arrayList.get(i2)).b()) {
                break;
            } else {
                i2++;
            }
        }
        textView.setVisibility(i);
    }

    public final void e() {
        C1281Jw0 c1281Jw0;
        g();
        ViewGroup viewGroup = (ViewGroup) this.p.findViewById(R.id.contents);
        this.u = viewGroup;
        viewGroup.removeAllViews();
        this.j.clear();
        this.k.clear();
        this.l.clear();
        int i = 0;
        while (i < this.q.c.size()) {
            C1281Jw0 c1281Jw02 = (C1281Jw0) this.q.c.get(i);
            boolean z = i == this.q.c.size() - 1;
            boolean z2 = c1281Jw02.z;
            if (z || z2) {
                c1281Jw0 = null;
            } else {
                c1281Jw0 = (C1281Jw0) this.q.c.get(i + 1);
                if (c1281Jw0.z) {
                    z2 = true;
                }
            }
            if (!z && !z2) {
                if ((c1281Jw02.a == 10) != (c1281Jw0.a == 10)) {
                    z2 = true;
                }
            }
            if (z2 || z) {
                a(this.u, c1281Jw02);
            } else {
                LinearLayout linearLayout = new LinearLayout(this.a);
                this.u.addView(linearLayout);
                View a = a(linearLayout, c1281Jw02);
                View a2 = a(linearLayout, c1281Jw0);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) a.getLayoutParams();
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) a2.getLayoutParams();
                layoutParams.width = 0;
                layoutParams.weight = 1.0f;
                layoutParams.setMarginEnd(this.i);
                layoutParams2.width = 0;
                layoutParams2.weight = 1.0f;
                i++;
            }
            i++;
        }
        this.u.addView(this.v);
    }

    public final View a(ViewGroup viewGroup, C1281Jw0 c1281Jw0) {
        C11258ww0 c11258ww0;
        TextWatcher textWatcher;
        View view;
        int i = c1281Jw0.a;
        Activity activity = this.a;
        if (i == 11) {
            View inflate = LayoutInflater.from(activity).inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e00f6, viewGroup, false);
            ((TextView) inflate.findViewById(R.id.label)).setText(c1281Jw0.p);
            ((ExpandableGridView) inflate.findViewById(R.id.icons_container)).setAdapter((ListAdapter) new C1540Lw0(activity, c1281Jw0.b, c1281Jw0.c));
            view = inflate;
        } else if (i == 13) {
            View inflate2 = LayoutInflater.from(activity).inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e01f1, viewGroup, false);
            ((TextView) inflate2.findViewById(R.id.top_label)).setText(c1281Jw0.p);
            ((TextView) inflate2.findViewById(R.id.mid_label)).setText(c1281Jw0.q);
            ((TextView) inflate2.findViewById(R.id.bottom_label)).setText(c1281Jw0.r);
            ((ImageView) inflate2.findViewById(R.id.icon)).setImageDrawable(AbstractC2884Wf.a(activity, c1281Jw0.w));
            view = inflate2;
        } else {
            ArrayList arrayList = this.j;
            if (i == 10) {
                C0891Gw0 c0891Gw0 = new C0891Gw0(activity, viewGroup, c1281Jw0, new RunnableC0111Aw0(this));
                arrayList.add(c0891Gw0);
                this.l.add(c0891Gw0.i);
                view = c0891Gw0.h;
            } else if (i == 12) {
                CheckBox checkBox = new CheckBox(this.p.getContext());
                checkBox.setId(R.id.payments_edit_checkbox);
                checkBox.setText(c1281Jw0.p);
                C7432ln3 c = C7432ln3.c();
                try {
                    boolean z = T60.a.getBoolean(c1281Jw0.s.toString(), true);
                    c.close();
                    checkBox.setChecked(z);
                    checkBox.setMinimumHeight(activity.getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f0801f7));
                    checkBox.setOnCheckedChangeListener(new C0241Bw0(c1281Jw0));
                    view = checkBox;
                } catch (Throwable th) {
                    try {
                        c.close();
                    } catch (Throwable unused) {
                    }
                    throw th;
                }
            } else {
                if (i == 7) {
                    c11258ww0 = this.m;
                    textWatcher = this.n;
                } else if (i == 1) {
                    TextWatcher textWatcher2 = c1281Jw0.i;
                    this.o = textWatcher2;
                    textWatcher = textWatcher2;
                    c11258ww0 = null;
                } else {
                    c11258ww0 = null;
                    textWatcher = null;
                }
                ViewOnClickListenerC2970Ww0 viewOnClickListenerC2970Ww0 = new ViewOnClickListenerC2970Ww0(this.a, c1281Jw0, this.h, c11258ww0, textWatcher);
                arrayList.add(viewOnClickListenerC2970Ww0);
                ArrayList arrayList2 = this.k;
                AutoCompleteTextView autoCompleteTextView = viewOnClickListenerC2970Ww0.i;
                arrayList2.add(autoCompleteTextView);
                int i2 = c1281Jw0.a;
                view = viewOnClickListenerC2970Ww0;
                if (i2 == 7) {
                    this.w = autoCompleteTextView;
                    view = viewOnClickListenerC2970Ww0;
                } else if (i2 == 1) {
                    this.x = autoCompleteTextView;
                    view = viewOnClickListenerC2970Ww0;
                }
            }
        }
        viewGroup.addView(view);
        return view;
    }

    public final void d() {
        QZ3 qz3 = this.C;
        if (qz3 == null) {
            if (this.u != null) {
                int dimensionPixelSize = this.a.getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f08071b);
                QZ3 qz32 = new QZ3(this.u);
                this.C = qz32;
                new C9097qe4(this.u, qz32, 0, dimensionPixelSize).b();
                return;
            }
            return;
        }
        qz3.c();
    }

    public final void g() {
        AutoCompleteTextView autoCompleteTextView = this.w;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.removeTextChangedListener(this.n);
            this.w.setFilters(new InputFilter[0]);
            this.w = null;
        }
        AutoCompleteTextView autoCompleteTextView2 = this.x;
        if (autoCompleteTextView2 != null) {
            autoCompleteTextView2.removeTextChangedListener(this.o);
            this.x = null;
        }
    }

    public final void h(C1930Ow0 c1930Ow0) {
        Activity activity = this.a;
        if (activity.isFinishing()) {
            return;
        }
        setOnShowListener(this);
        setOnDismissListener(this);
        this.q = c1930Ow0;
        View inflate = LayoutInflater.from(activity).inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e01ef, (ViewGroup) null);
        this.p = inflate;
        setContentView(inflate);
        this.v = LayoutInflater.from(activity).inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e00f5, (ViewGroup) null, false);
        EditorDialogToolbar editorDialogToolbar = (EditorDialogToolbar) this.p.findViewById(R.id.action_bar);
        editorDialogToolbar.setBackgroundColor(AbstractC10957w33.a(editorDialogToolbar.getContext()));
        Context context = editorDialogToolbar.getContext();
        editorDialogToolbar.q = R.style.f101600_resource_name_obfuscated_res_0x7f1503dd;
        C10475ug c10475ug = editorDialogToolbar.g;
        if (c10475ug != null) {
            c10475ug.setTextAppearance(context, R.style.f101600_resource_name_obfuscated_res_0x7f1503dd);
        }
        editorDialogToolbar.G(this.q.a);
        editorDialogToolbar.W = this.z != null;
        MenuItem findItem = editorDialogToolbar.o().findItem(R.id.delete_menu_id);
        if (findItem != null) {
            findItem.setVisible(editorDialogToolbar.W);
        }
        editorDialogToolbar.N = new C11601xw0(this);
        editorDialogToolbar.A(R.string.0_resource_name_obfuscated_res_0x7f1402f4);
        editorDialogToolbar.C(LN3.a(R.drawable.0_resource_name_obfuscated_res_0x7f0901bf, R.color.0_resource_name_obfuscated_res_0x7f07012b, getContext()));
        editorDialogToolbar.D(new ViewOnClickListenerC11944yw0(this));
        FadingEdgeScrollView fadingEdgeScrollView = (FadingEdgeScrollView) this.p.findViewById(R.id.scroll_view);
        fadingEdgeScrollView.i = 0;
        fadingEdgeScrollView.j = 1;
        fadingEdgeScrollView.invalidate();
        View findViewById = this.p.findViewById(R.id.shadow);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) findViewById.getLayoutParams();
        layoutParams.topMargin = editorDialogToolbar.getLayoutParams().height;
        findViewById.setLayoutParams(layoutParams);
        fadingEdgeScrollView.getViewTreeObserver().addOnScrollChangedListener(new K53(fadingEdgeScrollView, findViewById));
        e();
        f();
        Button button = (Button) this.p.findViewById(R.id.button_primary);
        this.r = button;
        button.setId(R.id.editor_dialog_done_button);
        this.r.setOnClickListener(this);
        String str = this.q.b;
        if (str != null) {
            this.r.setText(str);
        }
        Button button2 = (Button) this.p.findViewById(R.id.button_secondary);
        button2.setId(R.id.payments_edit_cancel_button);
        button2.setOnClickListener(this);
        d();
        this.p.setVisibility(4);
        show();
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        if (this.y != null && this.A) {
            return;
        }
        if (getCurrentFocus() != null) {
            C11939yv1.g.d(getCurrentFocus());
        }
        int i = 0;
        while (true) {
            ArrayList arrayList = this.k;
            if (i < arrayList.size()) {
                ((EditText) arrayList.get(i)).setEnabled(false);
                i++;
            } else {
                this.p.setVisibility(0);
                this.p.setLayerType(2, null);
                this.p.buildLayer();
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.p, (Property<View, Float>) View.TRANSLATION_Y, r0.getHeight(), 0.0f);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.p, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ofFloat, ofFloat2);
                this.y = animatorSet;
                animatorSet.setDuration(300L);
                this.y.setInterpolator(AbstractC8142nr1.g);
                this.y.addListener(new C0371Cw0(this));
                this.y.start();
                return;
            }
        }
    }

    public final ArrayList c(boolean z) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            ArrayList arrayList2 = this.j;
            if (i >= arrayList2.size()) {
                break;
            }
            InterfaceC1411Kw0 interfaceC1411Kw0 = (InterfaceC1411Kw0) arrayList2.get(i);
            if (!interfaceC1411Kw0.isValid()) {
                arrayList.add(interfaceC1411Kw0);
                if (!z) {
                    break;
                }
            }
            i++;
        }
        return arrayList;
    }
}
