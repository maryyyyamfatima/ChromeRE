package defpackage;

import J.N;
import android.app.Activity;
import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.chrome.R;
import org.chromium.chrome.browser.login.ChromeHttpAuthHandler;
import org.chromium.components.browser_ui.widget.text.AlertDialogEditText;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: tI1 */
/* loaded from: classes2.dex */
public final class C10008tI1 {
    public final InterfaceC9665sI1 a;
    public DialogC5834h8 b;
    public AlertDialogEditText c;
    public AlertDialogEditText d;

    public C10008tI1(Activity activity, String str, InterfaceC9665sI1 interfaceC9665sI1) {
        this.a = interfaceC9665sI1;
        View inflate = LayoutInflater.from(activity).inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e0128, (ViewGroup) null);
        this.c = (AlertDialogEditText) inflate.findViewById(R.id.username);
        AlertDialogEditText alertDialogEditText = (AlertDialogEditText) inflate.findViewById(R.id.password);
        this.d = alertDialogEditText;
        alertDialogEditText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: oI1
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                C10008tI1 c10008tI1 = C10008tI1.this;
                if (i == 6) {
                    c10008tI1.b.j.k.performClick();
                    return true;
                }
                c10008tI1.getClass();
                return false;
            }
        });
        ((TextView) inflate.findViewById(R.id.explanation)).setText(str);
        C5490g8 c5490g8 = new C5490g8(activity, R.style.f105200_resource_name_obfuscated_res_0x7f150545);
        c5490g8.i(R.string.0_resource_name_obfuscated_res_0x7f1405db);
        C4115c8 c4115c8 = c5490g8.a;
        c4115c8.q = inflate;
        c5490g8.f(R.string.0_resource_name_obfuscated_res_0x7f1405d9, new DialogInterface.OnClickListener() { // from class: pI1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C10008tI1 c10008tI1 = C10008tI1.this;
                String obj = c10008tI1.c.getText().toString();
                String obj2 = c10008tI1.d.getText().toString();
                ChromeHttpAuthHandler chromeHttpAuthHandler = (ChromeHttpAuthHandler) c10008tI1.a;
                N.MAMBiVB$(chromeHttpAuthHandler.a, chromeHttpAuthHandler, obj, obj2);
            }
        });
        c5490g8.e(R.string.0_resource_name_obfuscated_res_0x7f1402f4, new DialogInterface.OnClickListener() { // from class: qI1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                ((ChromeHttpAuthHandler) C10008tI1.this.a).V0();
            }
        });
        c4115c8.l = new DialogInterface.OnCancelListener() { // from class: rI1
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                ((ChromeHttpAuthHandler) C10008tI1.this.a).V0();
            }
        };
        DialogC5834h8 a = c5490g8.a();
        this.b = a;
        ((LayoutInflaterFactory2C0545Ef) a.c()).y = false;
        this.b.getWindow().setSoftInputMode(4);
    }
}
