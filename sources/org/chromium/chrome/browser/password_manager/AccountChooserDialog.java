package org.chromium.chrome.browser.password_manager;

import J.N;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import com.android.chrome.R;
import defpackage.AbstractC6770js;
import defpackage.C11290x2;
import defpackage.C11633y2;
import defpackage.C4115c8;
import defpackage.C5490g8;
import defpackage.DialogC5834h8;
import defpackage.DialogInterfaceOnClickListenerC11976z2;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class AccountChooserDialog implements DialogInterface.OnClickListener, DialogInterface.OnDismissListener {
    public final Context a;
    public final Credential[] g;
    public final String h;
    public final int i;
    public final int j;
    public final String k;
    public final String l;
    public C11290x2 m;
    public Credential n;
    public long o;
    public DialogC5834h8 p;
    public boolean q = false;

    public AccountChooserDialog(Activity activity, long j, Credential[] credentialArr, String str, int i, int i2, String str2, String str3) {
        this.o = j;
        this.a = activity;
        this.g = (Credential[]) credentialArr.clone();
        this.h = str;
        this.i = i;
        this.j = i2;
        this.k = str2;
        this.l = str3;
    }

    public static AccountChooserDialog createAndShowAccountChooser(WindowAndroid windowAndroid, long j, Credential[] credentialArr, String str, int i, int i2, String str2, String str3) {
        int i3;
        Activity activity = (Activity) windowAndroid.k().get();
        if (activity == null) {
            return null;
        }
        AccountChooserDialog accountChooserDialog = new AccountChooserDialog(activity, j, credentialArr, str, i, i2, str2, str3);
        View inflate = LayoutInflater.from(activity).inflate(R.layout.f55470_resource_name_obfuscated_res_0x7f0e0021, (ViewGroup) null);
        ((TextView) inflate.findViewById(R.id.origin)).setText(accountChooserDialog.k);
        TextView textView = (TextView) inflate.findViewById(R.id.title);
        String str4 = accountChooserDialog.h;
        int i4 = accountChooserDialog.i;
        if (i4 != 0 && (i3 = accountChooserDialog.j) != 0) {
            SpannableString spannableString = new SpannableString(str4);
            spannableString.setSpan(new C11633y2(accountChooserDialog), i4, i3, 18);
            textView.setText(spannableString, TextView.BufferType.SPANNABLE);
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        } else {
            textView.setText(str4);
        }
        accountChooserDialog.m = new C11290x2(accountChooserDialog, activity, accountChooserDialog.g);
        C5490g8 c5490g8 = new C5490g8(activity, R.style.f105200_resource_name_obfuscated_res_0x7f150545);
        C4115c8 c4115c8 = c5490g8.a;
        c4115c8.e = inflate;
        c5490g8.e(R.string.f69890_resource_name_obfuscated_res_0x7f1402f4, accountChooserDialog);
        C11290x2 c11290x2 = accountChooserDialog.m;
        DialogInterfaceOnClickListenerC11976z2 dialogInterfaceOnClickListenerC11976z2 = new DialogInterfaceOnClickListenerC11976z2(accountChooserDialog);
        c4115c8.o = c11290x2;
        c4115c8.p = dialogInterfaceOnClickListenerC11976z2;
        String str5 = accountChooserDialog.l;
        if (!TextUtils.isEmpty(str5)) {
            c5490g8.g(str5, accountChooserDialog);
        }
        DialogC5834h8 a = c5490g8.a();
        accountChooserDialog.p = a;
        a.setOnDismissListener(accountChooserDialog);
        accountChooserDialog.p.show();
        return accountChooserDialog;
    }

    public final void imageFetchComplete(int i, Bitmap bitmap) {
        View childAt;
        if (this.o == 0) {
            return;
        }
        BitmapDrawable a = AbstractC6770js.a(this.a.getResources(), bitmap, bitmap.getHeight());
        this.g[i].f = a;
        AlertController$RecycleListView alertController$RecycleListView = this.p.j.g;
        if (i < alertController$RecycleListView.getFirstVisiblePosition() || i > alertController$RecycleListView.getLastVisiblePosition() || (childAt = alertController$RecycleListView.getChildAt(i - alertController$RecycleListView.getFirstVisiblePosition())) == null) {
            return;
        }
        ((ImageView) childAt.findViewById(R.id.profile_image)).setImageDrawable(a);
    }

    public final void notifyNativeDestroyed() {
        this.o = 0L;
        DialogC5834h8 dialogC5834h8 = this.p;
        if (dialogC5834h8 != null) {
            dialogC5834h8.dismiss();
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        if (i == -1) {
            this.n = this.g[0];
            this.q = true;
        }
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.p = null;
        long j = this.o;
        if (j == 0) {
            return;
        }
        Credential credential = this.n;
        if (credential != null) {
            N.MJZem$De(j, this, credential.e, this.q);
        } else {
            N.M$NQU8jD(j, this);
        }
    }
}
