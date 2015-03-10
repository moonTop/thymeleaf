/*
 * =============================================================================
 * 
 *   Copyright (c) 2011-2014, The THYMELEAF team (http://www.thymeleaf.org)
 * 
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 * 
 *       http://www.apache.org/licenses/LICENSE-2.0
 * 
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 * 
 * =============================================================================
 */
package org.thymeleaf.aurora.engine;

import org.thymeleaf.aurora.context.ITemplateProcessingContext;

/**
 *
 * @author Daniel Fern&aacute;ndez
 * @since 3.0.0
 *
 */
public final class ProcessorTemplateHandler extends AbstractTemplateHandler {


    private final ITemplateProcessingContext processingContext;



    /**
     * <p>
     *   Creates a new instance of this handler.
     * </p>
     *
     * @param processingContext the template processing context
     */
    public ProcessorTemplateHandler(final ITemplateProcessingContext processingContext) {
        super();
        this.processingContext = processingContext;
    }





    @Override
    public void handleText(final IText text) {

        super.handleText(text);

    }



    @Override
    public void handleComment(final IComment comment) {
        
        super.handleComment(comment);

    }

    
    @Override
    public void handleCDATASection(final ICDATASection cdataSection) {
        
        super.handleCDATASection(cdataSection);

    }




    @Override
    public void handleStandaloneElement(final IStandaloneElementTag standaloneElementTag) {

        super.handleStandaloneElement(standaloneElementTag);

    }


    @Override
    public void handleOpenElement(final IOpenElementTag openElementTag) {

        super.handleOpenElement(openElementTag);

    }


    @Override
    public void handleAutoOpenElement(final IOpenElementTag openElementTag) {

        super.handleAutoOpenElement(openElementTag);

    }


    @Override
    public void handleCloseElement(final ICloseElementTag closeElementTag) {

        super.handleCloseElement(closeElementTag);

    }


    @Override
    public void handleAutoCloseElement(final ICloseElementTag closeElementTag) {

        super.handleAutoCloseElement(closeElementTag);

    }


    @Override
    public void handleUnmatchedCloseElement(final ICloseElementTag closeElementTag) {

        super.handleUnmatchedCloseElement(closeElementTag);

    }




    @Override
    public void handleDocType(final IDocType docType) {
        
        super.handleDocType(docType);

    }

    
    
    
    @Override
    public void handleXmlDeclaration(final IXMLDeclaration xmlDeclaration) {

        super.handleXmlDeclaration(xmlDeclaration);

    }






    @Override
    public void handleProcessingInstruction(final IProcessingInstruction processingInstruction) {
        
        super.handleProcessingInstruction(processingInstruction);

    }


    
}