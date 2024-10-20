package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.android.chrome.R;
import java.util.ArrayList;
import java.util.Arrays;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.image_editor.text.TextEditModeView;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes5.dex */
public final class LH3 {
    public final QH3 a;
    public final TextEditModeView b;
    public final EditText c;
    public final TextView d;
    public final C2786Vl1 e;
    public final OW f;

    public LH3(Context context, View view, C2786Vl1 c2786Vl1, C0143Bc2 c0143Bc2, Callback callback) {
        this.e = c2786Vl1;
        PropertyModel propertyModel = new PropertyModel(new ArrayList(Arrays.asList(RH3.i)));
        TextEditModeView textEditModeView = (TextEditModeView) view.findViewById(R.id.edit_mode_container);
        this.b = textEditModeView;
        TextView textView = (TextView) textEditModeView.findViewById(R.id.edit_mode_text);
        this.d = textView;
        if (textView != null) {
            Object obj = Y50.a;
            textView.setBackground(context.getDrawable(R.drawable.0_resource_name_obfuscated_res_0x7f090171));
        }
        this.f = new OW(context, textEditModeView, c2786Vl1);
        EditText editText = (EditText) textEditModeView.findViewById(R.id.edit_mode_input);
        this.c = editText;
        this.a = new QH3(context, propertyModel, editText, c0143Bc2, callback);
        UD2.a(propertyModel, textEditModeView, new TD2() { // from class: KH3
            @Override // defpackage.TD2
            public final void d(WD2 wd2, Object obj2, Object obj3) {
                PropertyModel propertyModel2 = (PropertyModel) wd2;
                TextEditModeView textEditModeView2 = (TextEditModeView) obj2;
                FD2 fd2 = (FD2) obj3;
                LD2 ld2 = RH3.a;
                if (ld2 == fd2) {
                    textEditModeView2.setVisibility(propertyModel2.j(ld2) ? 0 : 4);
                    return;
                }
                PD2 pd2 = RH3.b;
                if (pd2 != fd2) {
                    ND2 nd2 = RH3.c;
                    if (nd2 == fd2) {
                        int h = propertyModel2.h(nd2);
                        textEditModeView2.g.setTextColor(h);
                        textEditModeView2.g.setHintTextColor(h);
                        return;
                    }
                    MD2 md2 = RH3.d;
                    if (md2 != fd2) {
                        PD2 pd22 = RH3.e;
                        if (pd22 != fd2) {
                            PD2 pd23 = RH3.f;
                            if (pd23 == fd2) {
                                final Runnable runnable = (Runnable) propertyModel2.i(pd23);
                                textEditModeView2.findViewById(R.id.edit_mode_done).setOnClickListener(new View.OnClickListener() { // from class: UH3
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view2) {
                                        int i = TextEditModeView.k;
                                        runnable.run();
                                    }
                                });
                                return;
                            }
                            PD2 pd24 = RH3.g;
                            if (pd24 == fd2) {
                                final Runnable runnable2 = (Runnable) propertyModel2.i(pd24);
                                textEditModeView2.h.a = new Runnable() { // from class: TH3
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        int i = TextEditModeView.k;
                                        runnable2.run();
                                    }
                                };
                                return;
                            } else {
                                PD2 pd25 = RH3.h;
                                if (pd25 == fd2) {
                                    textEditModeView2.g.addOnLayoutChangeListener((View.OnLayoutChangeListener) propertyModel2.i(pd25));
                                    return;
                                }
                                return;
                            }
                        }
                        textEditModeView2.g.setTypeface((Typeface) propertyModel2.i(pd22));
                        return;
                    }
                    textEditModeView2.g.setTextSize(0, propertyModel2.g(md2));
                    return;
                }
                textEditModeView2.h.setText((String) propertyModel2.i(pd2));
            }
        });
    }

    public final boolean a() {
        EditText editText = this.c;
        return editText != null && editText.getText().length() == 0;
    }
}
