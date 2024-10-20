package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.android.chrome.R;
import java.util.Locale;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Rq, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2289Rq extends AbstractC11227wr implements TextWatcher {
    public final InterfaceC2159Qq l;
    public final EditText m;
    public final ImageView n;
    public PopupWindow o;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C2289Rq(Activity activity, InterfaceC2159Qq interfaceC2159Qq, String str, String str2, int i, String str3, String str4, boolean z) {
        super(activity, interfaceC2159Qq, R.layout.f55980_resource_name_obfuscated_res_0x7f0e0054, str2, i, str3, str4, z);
        this.l = interfaceC2159Qq;
        this.j.findViewById(R.id.cc_details).setVisibility(8);
        EditText editText = (EditText) this.j.findViewById(R.id.cc_name_edit);
        this.m = editText;
        editText.setText(str, TextView.BufferType.EDITABLE);
        ImageView imageView = (ImageView) this.j.findViewById(R.id.cc_name_tooltip_icon);
        this.n = imageView;
        this.g.k(AbstractC4249cY1.m, str.isEmpty());
        if (TextUtils.isEmpty(str)) {
            imageView.setVisibility(8);
        } else {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: Nq
                /* JADX WARN: Type inference failed for: r0v2, types: [Pq] */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    final C2289Rq c2289Rq = C2289Rq.this;
                    if (c2289Rq.o != null) {
                        return;
                    }
                    c2289Rq.o = new PopupWindow(c2289Rq.i);
                    final ?? r0 = new Runnable() { // from class: Pq
                        @Override // java.lang.Runnable
                        public final void run() {
                            C2289Rq.this.o = null;
                        }
                    };
                    Locale locale = Locale.getDefault();
                    int i2 = CJ3.a;
                    boolean z2 = TextUtils.getLayoutDirectionFromLocale(locale) == 0;
                    Context context = c2289Rq.i;
                    PopupWindow popupWindow = c2289Rq.o;
                    ImageView imageView2 = c2289Rq.n;
                    View view2 = z2 ? c2289Rq.m : imageView2;
                    TextView textView = new TextView(context);
                    textView.setText(R.string.f68600_resource_name_obfuscated_res_0x7f140254);
                    textView.setTextAppearance(R.style.f102750_resource_name_obfuscated_res_0x7f150450);
                    Resources resources = context.getResources();
                    int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.f28360_resource_name_obfuscated_res_0x7f080080);
                    int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.f28370_resource_name_obfuscated_res_0x7f080081);
                    textView.setPadding(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2);
                    textView.measure(0, 0);
                    popupWindow.setContentView(textView);
                    popupWindow.setHeight(-2);
                    popupWindow.setWidth(-2);
                    popupWindow.setOutsideTouchable(true);
                    popupWindow.setBackgroundDrawable(AbstractC9771sd.c(resources, R.drawable.f53490_resource_name_obfuscated_res_0x7f0904a1, 0));
                    final Lr lr = new Lr(popupWindow);
                    V60.a.registerComponentCallbacks(lr);
                    popupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: Jr
                        @Override // android.widget.PopupWindow.OnDismissListener
                        public final void onDismiss() {
                            new Handler().postDelayed(r0, 200L);
                            V60.a.unregisterComponentCallbacks(lr);
                        }
                    });
                    popupWindow.showAsDropDown(view2, Math.max(0, imageView2.getLeft() - textView.getMeasuredWidth()), 0);
                    textView.announceForAccessibility(textView.getText());
                }
            });
        }
        editText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: Oq
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
                C2289Rq c2289Rq = C2289Rq.this;
                if (i2 != 6) {
                    c2289Rq.getClass();
                    return false;
                }
                if (c2289Rq.m.getText().toString().trim().length() != 0) {
                    c2289Rq.c(0, c2289Rq.g);
                }
                return true;
            }
        });
        editText.addTextChangedListener(this);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.g.k(AbstractC4249cY1.m, this.m.getText().toString().trim().isEmpty());
    }

    @Override // defpackage.InterfaceC3906bY1
    public final void c(int i, PropertyModel propertyModel) {
        if (i == 0) {
            this.l.d(this.m.getText().toString());
            this.h.c(1, propertyModel);
        } else if (i == 1) {
            this.h.c(2, propertyModel);
        }
    }

    @Override // defpackage.InterfaceC3906bY1
    public final void a(int i) {
        InterfaceC2159Qq interfaceC2159Qq = this.l;
        if (i == 2) {
            interfaceC2159Qq.e();
        }
        interfaceC2159Qq.c();
    }
}
