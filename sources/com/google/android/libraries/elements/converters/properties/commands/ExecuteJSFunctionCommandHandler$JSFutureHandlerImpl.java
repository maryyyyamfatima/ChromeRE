package com.google.android.libraries.elements.converters.properties.commands;

import com.google.android.libraries.elements.interfaces.JSFutureHandler;
import defpackage.C10239ty0;
import defpackage.C4252cZ;
import defpackage.InterfaceC5627gZ;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class ExecuteJSFunctionCommandHandler$JSFutureHandlerImpl extends JSFutureHandler {
    private InterfaceC5627gZ emitter;

    public ExecuteJSFunctionCommandHandler$JSFutureHandlerImpl(InterfaceC5627gZ interfaceC5627gZ) {
        this.emitter = interfaceC5627gZ;
    }

    @Override // com.google.android.libraries.elements.interfaces.JSFutureHandler
    public void onSuccess() {
        InterfaceC5627gZ interfaceC5627gZ = this.emitter;
        if (interfaceC5627gZ == null) {
            return;
        }
        ((C4252cZ) interfaceC5627gZ).a();
    }

    @Override // com.google.android.libraries.elements.interfaces.JSFutureHandler
    public void onError(String str) {
        InterfaceC5627gZ interfaceC5627gZ = this.emitter;
        if (interfaceC5627gZ == null) {
            return;
        }
        ((C4252cZ) interfaceC5627gZ).b(new C10239ty0(str));
    }

    public void cancel() {
        this.emitter = null;
    }
}
