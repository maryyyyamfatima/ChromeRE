package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import defpackage.AbstractC4199cO1;
import defpackage.AbstractC7848n0;
import defpackage.C5800h21;
import defpackage.C8543p11;
import defpackage.HandlerC10413uU3;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {
    public static final /* synthetic */ int g = 0;
    public int a = 0;

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.a = bundle.getInt("resolution");
        }
        if (this.a != 1) {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                Log.e("GoogleApiActivity", "Activity started without extras");
                finish();
                return;
            }
            PendingIntent pendingIntent = (PendingIntent) extras.get("pending_intent");
            Integer num = (Integer) extras.get("error_code");
            if (pendingIntent == null && num == null) {
                Log.e("GoogleApiActivity", "Activity started without resolution");
                finish();
                return;
            }
            if (pendingIntent != null) {
                try {
                    startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
                    this.a = 1;
                    return;
                } catch (ActivityNotFoundException e) {
                    if (extras.getBoolean("notify_manager", true)) {
                        C5800h21.a(this).d(getIntent().getIntExtra("failing_client_id", -1), new ConnectionResult(22, null));
                    } else {
                        String a = AbstractC4199cO1.a("Activity not found while launching ", String.valueOf(pendingIntent), ".");
                        if (Build.FINGERPRINT.contains("generic")) {
                            a = AbstractC7848n0.a(a, " This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                        }
                        Log.e("GoogleApiActivity", a, e);
                    }
                    this.a = 1;
                    finish();
                    return;
                } catch (IntentSender.SendIntentException e2) {
                    Log.e("GoogleApiActivity", "Failed to launch pendingIntent", e2);
                    finish();
                    return;
                }
            }
            AlertDialog d = C8543p11.d.d(num.intValue(), 2, this, this);
            if (d != null) {
                C8543p11.i(this, d, "GooglePlayServicesErrorDialog", this);
            }
            this.a = 1;
        }
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.a = 0;
            setResult(i2, intent);
            if (booleanExtra) {
                C5800h21 a = C5800h21.a(this);
                if (i2 == -1) {
                    HandlerC10413uU3 handlerC10413uU3 = a.s;
                    handlerC10413uU3.sendMessage(handlerC10413uU3.obtainMessage(3));
                } else if (i2 == 0) {
                    a.d(getIntent().getIntExtra("failing_client_id", -1), new ConnectionResult(13, null));
                }
            }
        } else if (i == 2) {
            this.a = 0;
            setResult(i2, intent);
        }
        finish();
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("resolution", this.a);
        super.onSaveInstanceState(bundle);
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.a = 0;
        setResult(0);
        finish();
    }
}
