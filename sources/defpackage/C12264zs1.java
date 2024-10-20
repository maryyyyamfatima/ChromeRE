package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.android.chrome.R;
import org.chromium.ui.base.DeviceFormFactor;
import org.chromium.ui.widget.TextViewWithClickableSpans;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: zs1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C12264zs1 {
    public final Context a;
    public final Window b;
    public DialogC11235ws1 c;
    public final InterfaceC11921ys1 d;
    public final TextViewWithClickableSpans e;
    public final ProgressBar f;
    public final ListView g;
    public final TextView h;
    public final Button i;
    public final C11578xs1 j;
    public final C1745Nl0 k;
    public boolean l;

    public C12264zs1(Context context, Window window, InterfaceC11921ys1 interfaceC11921ys1, C11578xs1 c11578xs1) {
        this.a = context;
        this.b = window;
        this.d = interfaceC11921ys1;
        this.j = c11578xs1;
        final LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(context).inflate(R.layout.f58190_resource_name_obfuscated_res_0x7f0e0146, (ViewGroup) null);
        ListView listView = (ListView) linearLayout.findViewById(R.id.items);
        this.g = listView;
        this.f = (ProgressBar) linearLayout.findViewById(R.id.progress);
        TextView textView = (TextView) linearLayout.findViewById(R.id.status);
        this.h = textView;
        TextViewWithClickableSpans textViewWithClickableSpans = (TextViewWithClickableSpans) linearLayout.findViewById(R.id.dialog_title);
        TextViewWithClickableSpans textViewWithClickableSpans2 = (TextViewWithClickableSpans) linearLayout.findViewById(R.id.not_found_message);
        this.e = textViewWithClickableSpans2;
        textViewWithClickableSpans.setText(c11578xs1.a);
        textViewWithClickableSpans.setMovementMethod(LinkMovementMethod.getInstance());
        textViewWithClickableSpans2.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        Button button = (Button) linearLayout.findViewById(R.id.positive);
        this.i = button;
        button.setText(c11578xs1.g);
        button.setEnabled(false);
        ViewOnClickListenerC10892vs1 viewOnClickListenerC10892vs1 = new ViewOnClickListenerC10892vs1(this);
        C1745Nl0 c1745Nl0 = new C1745Nl0(R.layout.f58200_resource_name_obfuscated_res_0x7f0e0147, context, true);
        this.k = c1745Nl0;
        c1745Nl0.setNotifyOnChange(true);
        c1745Nl0.n = this;
        button.setOnClickListener(viewOnClickListenerC10892vs1);
        listView.setOnItemClickListener(c1745Nl0);
        listView.setAdapter((ListAdapter) c1745Nl0);
        listView.setChoiceMode(1);
        listView.setEmptyView(textViewWithClickableSpans2);
        listView.setDivider(null);
        b(1);
        this.l = false;
        DialogC11235ws1 dialogC11235ws1 = new DialogC11235ws1(this, context);
        this.c = dialogC11235ws1;
        dialogC11235ws1.requestWindowFeature(1);
        this.c.setCanceledOnTouchOutside(true);
        this.c.addContentView(linearLayout, new LinearLayout.LayoutParams(-1, -1));
        this.c.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: us1
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                C12264zs1.this.d.a("");
            }
        });
        Window window2 = this.c.getWindow();
        if (!DeviceFormFactor.a(context)) {
            window2.setBackgroundDrawable(new ColorDrawable(-1));
            window2.setGravity(48);
            window2.setLayout(-1, -2);
        }
        this.c.show();
        linearLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ts1
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                C12264zs1 c12264zs1 = C12264zs1.this;
                c12264zs1.getClass();
                if (i == i5 && i2 == i6 && i3 == i7 && i4 == i8) {
                    return;
                }
                View findViewById = linearLayout.findViewById(R.id.container);
                int height = c12264zs1.b.getDecorView().getHeight();
                findViewById.setLayoutParams(new LinearLayout.LayoutParams(-1, Math.round(JM1.b((Math.round((((height / r1) * 0.3f) / 48.0f) - 0.5f) + 0.5f) * 48.0f, 72.0f, 408.0f) * c12264zs1.a.getResources().getDisplayMetrics().density)));
            }
        });
    }

    public final void a(CharSequence charSequence, SpannableString spannableString) {
        this.g.setVisibility(8);
        this.f.setVisibility(8);
        TextViewWithClickableSpans textViewWithClickableSpans = this.e;
        textViewWithClickableSpans.setText(charSequence);
        textViewWithClickableSpans.setVisibility(0);
        this.h.setText(spannableString);
    }

    public final void b(int i) {
        CharSequence charSequence;
        ProgressBar progressBar = this.f;
        ListView listView = this.g;
        TextViewWithClickableSpans textViewWithClickableSpans = this.e;
        if (i != 0) {
            TextView textView = this.h;
            C11578xs1 c11578xs1 = this.j;
            if (i != 1) {
                if (i == 2) {
                    textView.setText(c11578xs1.d);
                    progressBar.setVisibility(8);
                    listView.setVisibility(0);
                    return;
                } else {
                    if (i != 3) {
                        return;
                    }
                    boolean isEmpty = this.k.isEmpty();
                    if (isEmpty) {
                        charSequence = c11578xs1.e;
                    } else {
                        charSequence = c11578xs1.f;
                    }
                    textView.setText(charSequence);
                    textViewWithClickableSpans.setText(c11578xs1.c);
                    textViewWithClickableSpans.setVisibility(isEmpty ? 0 : 8);
                    return;
                }
            }
            textView.setText(c11578xs1.b);
        }
        listView.setVisibility(8);
        progressBar.setVisibility(0);
        textViewWithClickableSpans.setVisibility(8);
    }
}
