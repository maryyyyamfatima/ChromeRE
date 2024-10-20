package org.chromium.components.permissions;

import J.N;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.text.SpannableString;
import android.text.TextUtils;
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
import com.android.chrome.R;
import defpackage.AbstractC11140wc2;
import defpackage.AbstractC3899bX;
import defpackage.C11055wM;
import defpackage.C1745Nl0;
import defpackage.DialogC11958yz;
import org.chromium.components.permissions.BluetoothScanningPermissionDialog;
import org.chromium.ui.base.DeviceFormFactor;
import org.chromium.ui.base.WindowAndroid;
import org.chromium.ui.widget.TextViewWithClickableSpans;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class BluetoothScanningPermissionDialog {
    public final Activity a;
    public final Context b;
    public DialogC11958yz c;
    public final ListView d;
    public final C1745Nl0 e;
    public boolean f;
    public final BluetoothScanningPromptAndroidDelegate g;
    public long h;

    public BluetoothScanningPermissionDialog(WindowAndroid windowAndroid, String str, int i, BluetoothScanningPromptAndroidDelegate bluetoothScanningPromptAndroidDelegate, long j) {
        this.a = (Activity) windowAndroid.k().get();
        Context context = (Context) windowAndroid.j.get();
        this.b = context;
        this.g = bluetoothScanningPromptAndroidDelegate;
        this.h = j;
        SpannableString spannableString = new SpannableString(str);
        boolean z = !AbstractC3899bX.e(context);
        C11055wM a = bluetoothScanningPromptAndroidDelegate.a();
        AbstractC11140wc2.a(spannableString, context, a, i, false, z, true);
        a.a();
        SpannableString spannableString2 = new SpannableString(context.getString(R.string.0_resource_name_obfuscated_res_0x7f14028c, str));
        TextUtils.copySpansFrom(spannableString, 0, spannableString.length(), Object.class, spannableString2, spannableString2.toString().indexOf(str));
        String string = context.getString(R.string.0_resource_name_obfuscated_res_0x7f14028b);
        String string2 = context.getString(R.string.0_resource_name_obfuscated_res_0x7f14028a);
        String string3 = context.getString(R.string.0_resource_name_obfuscated_res_0x7f140289);
        final LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(context).inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e005f, (ViewGroup) null);
        TextViewWithClickableSpans textViewWithClickableSpans = (TextViewWithClickableSpans) linearLayout.findViewById(R.id.dialog_title);
        textViewWithClickableSpans.setText(spannableString2);
        textViewWithClickableSpans.setMovementMethod(LinkMovementMethod.getInstance());
        TextViewWithClickableSpans textViewWithClickableSpans2 = (TextViewWithClickableSpans) linearLayout.findViewById(R.id.not_found_message);
        textViewWithClickableSpans2.setText(string);
        textViewWithClickableSpans2.setMovementMethod(LinkMovementMethod.getInstance());
        textViewWithClickableSpans2.setVisibility(0);
        ListView listView = (ListView) linearLayout.findViewById(R.id.items);
        this.d = listView;
        C1745Nl0 c1745Nl0 = new C1745Nl0(R.layout.0_resource_name_obfuscated_res_0x7f0e0060, context, false);
        this.e = c1745Nl0;
        c1745Nl0.setNotifyOnChange(true);
        listView.setAdapter((ListAdapter) c1745Nl0);
        listView.setEmptyView(textViewWithClickableSpans2);
        listView.setDivider(null);
        ((ProgressBar) linearLayout.findViewById(R.id.progress)).setVisibility(8);
        Button button = (Button) linearLayout.findViewById(R.id.block);
        button.setText(string2);
        button.setEnabled(true);
        button.setOnClickListener(new View.OnClickListener() { // from class: uz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BluetoothScanningPermissionDialog bluetoothScanningPermissionDialog = BluetoothScanningPermissionDialog.this;
                long j2 = bluetoothScanningPermissionDialog.h;
                if (j2 != 0) {
                    N.MdX25cA2(j2, 1);
                }
                bluetoothScanningPermissionDialog.c.setOnDismissListener(null);
                bluetoothScanningPermissionDialog.c.dismiss();
            }
        });
        Button button2 = (Button) linearLayout.findViewById(R.id.allow);
        button2.setText(string3);
        button2.setEnabled(true);
        button2.setOnClickListener(new View.OnClickListener() { // from class: vz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BluetoothScanningPermissionDialog bluetoothScanningPermissionDialog = BluetoothScanningPermissionDialog.this;
                long j2 = bluetoothScanningPermissionDialog.h;
                if (j2 != 0) {
                    N.MdX25cA2(j2, 0);
                }
                bluetoothScanningPermissionDialog.c.setOnDismissListener(null);
                bluetoothScanningPermissionDialog.c.dismiss();
            }
        });
        this.f = false;
        DialogC11958yz dialogC11958yz = new DialogC11958yz(this, context);
        this.c = dialogC11958yz;
        dialogC11958yz.requestWindowFeature(1);
        this.c.setCanceledOnTouchOutside(true);
        this.c.addContentView(linearLayout, new LinearLayout.LayoutParams(-1, -1));
        this.c.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: xz
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                long j2 = BluetoothScanningPermissionDialog.this.h;
                if (j2 == 0) {
                    return;
                }
                N.MdX25cA2(j2, 2);
            }
        });
        Window window = this.c.getWindow();
        if (!DeviceFormFactor.a(context)) {
            window.setBackgroundDrawable(new ColorDrawable(-1));
            window.setGravity(48);
            window.setLayout(-1, -2);
        }
        this.c.show();
        linearLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: wz
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                BluetoothScanningPermissionDialog bluetoothScanningPermissionDialog = BluetoothScanningPermissionDialog.this;
                bluetoothScanningPermissionDialog.getClass();
                if (i2 == i6 && i3 == i7 && i4 == i8 && i5 == i9) {
                    return;
                }
                View findViewById = linearLayout.findViewById(R.id.container);
                int height = bluetoothScanningPermissionDialog.a.getWindow().getDecorView().getHeight();
                findViewById.setLayoutParams(new LinearLayout.LayoutParams(-1, Math.round(JM1.b((Math.round((((height / r1) * 0.3f) / 48.0f) - 0.5f) + 0.5f) * 48.0f, 72.0f, 408.0f) * bluetoothScanningPermissionDialog.b.getResources().getDisplayMetrics().density)));
            }
        });
    }

    public static BluetoothScanningPermissionDialog create(WindowAndroid windowAndroid, String str, int i, BluetoothScanningPromptAndroidDelegate bluetoothScanningPromptAndroidDelegate, long j) {
        return new BluetoothScanningPermissionDialog(windowAndroid, str, i, bluetoothScanningPromptAndroidDelegate, j);
    }

    public void addOrUpdateDevice(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            str2 = this.b.getString(R.string.0_resource_name_obfuscated_res_0x7f140288, str);
        }
        this.e.a(null, str, str2, null);
        this.d.setVisibility(0);
    }

    public final void closeDialog() {
        this.h = 0L;
        this.c.dismiss();
    }
}
