package com.google.android.libraries.elements.converters.properties.commands.fusion;

import com.google.android.libraries.elements.interfaces.CommandRunCompletionCallback;
import defpackage.C4238cW0;
import defpackage.C6215iF;
import io.grpc.Status;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
class FusionCommandResolver$2 extends CommandRunCompletionCallback {
    final /* synthetic */ C6215iF val$completer;

    public FusionCommandResolver$2(C4238cW0 c4238cW0, C6215iF c6215iF) {
        this.val$completer = c6215iF;
    }

    @Override // com.google.android.libraries.elements.interfaces.CommandRunCompletionCallback
    public void completion(Status status) {
        this.val$completer.a(status);
    }
}
