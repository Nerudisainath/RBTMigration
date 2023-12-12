<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>div_Request for Quote                      _c7788e</name>
   <tag></tag>
   <elementGuidId>2c3f0e73-ca6b-4a70-9115-00f5dfa9aefc</elementGuidId>
   <selectorCollection>
      <entry>
         <key>CSS</key>
         <value>div.form-elements.pad-30</value>
      </entry>
      <entry>
         <key>XPATH</key>
         <value>//body[@id='post']/main/div/div[2]/div[2]/div/div[2]/div/div</value>
      </entry>
   </selectorCollection>
   <selectorMethod>XPATH</selectorMethod>
   <useRalativeImagePath>true</useRalativeImagePath>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>div</value>
      <webElementGuid>1e68ca32-1a2b-45b8-b9b1-7d37aa41eb00</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>class</name>
      <type>Main</type>
      <value>form-elements pad-30</value>
      <webElementGuid>16ca2e1d-d220-4a95-9cfc-6d59cdb02455</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>
                                    Request for Quote
                                    
                                        
    
        










    

    
        
            
            Enter Your Name *
            
        
    
    
        
            
            Enter Your Email ID *
            
        
    
    
        
            
            Enter Your Phone Number *
            
        
    
    
        
            
            Message
        
    
    
        

            
                
            

        
    
    
        
    
    
    
        Email alredy Exist,Please try after 24 hours
    
    
        
    







window.reCaptchaSiteKey = '6LdKBfsnAAAAAH5DtEBBV8uRVpcfZZiIITG64gKU';


    //to genarate token  and append for recaptcha  hidden field.
    function generateCaptchaRequestForQuoteSolutionsAndServices() {
        grecaptcha.ready(() => {
            grecaptcha
                .execute(window.reCaptchaSiteKey, { action: 'requestquoteservicepage' })
                .then(token => {
                    
                    document.getElementById('4ff9088c-fd6d-4104-b852-afa5cc59e4a7-captchaToken').value = token;
                })
                .catch(error => {
                    console.error(error);
                });
        });
    };
    //to check recaptcha hidden field is empty or not,before submission of form.
    function onBeginSubmitRequestForQuoteSolutionsAndServices() {
        var token = document.getElementById('4ff9088c-fd6d-4104-b852-afa5cc59e4a7-captchaToken').value;
        if (token === '') {
            grecaptcha.ready(() => {
                grecaptcha
                    .execute(window.reCaptchaSiteKey, { action: 'requestquoteservicepage' })
                    .then(token => {
                        
                        document.getElementById('4ff9088c-fd6d-4104-b852-afa5cc59e4a7-captchaToken').value = token;
                    })
                    .catch(error => {
                        console.error(error);
                    });
            });
        }
    };
    //the recaptcha token valid upto 2 min only, so here genarating new token for every 1.5 min.
    setInterval(function () {
        generateCaptchaRequestForQuoteSolutionsAndServices();
    }, 1.5 * 60 * 1000);
    //Intial token genarator
    generateCaptchaRequestForQuoteSolutionsAndServices();





    


    
                                    
                                </value>
      <webElementGuid>5c4456a5-5814-425a-88d0-357f59338867</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>id(&quot;post&quot;)/main[1]/div[@class=&quot;services dell_boomi&quot;]/div[@class=&quot;page-banner req-quote clouds sec-pad pb-form-0&quot;]/div[@class=&quot;container&quot;]/div[@class=&quot;row&quot;]/div[@class=&quot;col-sm-5 col-md-4&quot;]/div[@class=&quot;req-from&quot;]/div[@class=&quot;form-elements pad-30&quot;]</value>
      <webElementGuid>8c1c52ef-51a6-481a-ae7e-510ad0916fa7</webElementGuid>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:idRelative</name>
      <type>Main</type>
      <value>//body[@id='post']/main/div/div[2]/div[2]/div/div[2]/div/div</value>
      <webElementGuid>2ce613a7-30b7-480f-971a-116260d42f4d</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='Project sign-off along with post-implementation support to fix recurring bugs'])[1]/following::div[3]</value>
      <webElementGuid>fbd557fb-893d-425c-b438-c271a5f24d0f</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='Meticulous approach and Best Practices in building entire Boomi Implementation'])[1]/following::div[3]</value>
      <webElementGuid>3a3448cc-4df0-441c-b7fa-d6f0c1ae3561</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <type>Main</type>
      <value>//div[2]/div/div[2]/div/div</value>
      <webElementGuid>25ee3493-4468-4d94-a027-5ba0193db76c</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:customAttributes</name>
      <type>Main</type>
      <value>//div[(text() = concat(&quot;
                                    Request for Quote
                                    
                                        
    
        










    

    
        
            
            Enter Your Name *
            
        
    
    
        
            
            Enter Your Email ID *
            
        
    
    
        
            
            Enter Your Phone Number *
            
        
    
    
        
            
            Message
        
    
    
        

            
                
            

        
    
    
        
    
    
    
        Email alredy Exist,Please try after 24 hours
    
    
        
    







window.reCaptchaSiteKey = &quot; , &quot;'&quot; , &quot;6LdKBfsnAAAAAH5DtEBBV8uRVpcfZZiIITG64gKU&quot; , &quot;'&quot; , &quot;;


    //to genarate token  and append for recaptcha  hidden field.
    function generateCaptchaRequestForQuoteSolutionsAndServices() {
        grecaptcha.ready(() => {
            grecaptcha
                .execute(window.reCaptchaSiteKey, { action: &quot; , &quot;'&quot; , &quot;requestquoteservicepage&quot; , &quot;'&quot; , &quot; })
                .then(token => {
                    
                    document.getElementById(&quot; , &quot;'&quot; , &quot;4ff9088c-fd6d-4104-b852-afa5cc59e4a7-captchaToken&quot; , &quot;'&quot; , &quot;).value = token;
                })
                .catch(error => {
                    console.error(error);
                });
        });
    };
    //to check recaptcha hidden field is empty or not,before submission of form.
    function onBeginSubmitRequestForQuoteSolutionsAndServices() {
        var token = document.getElementById(&quot; , &quot;'&quot; , &quot;4ff9088c-fd6d-4104-b852-afa5cc59e4a7-captchaToken&quot; , &quot;'&quot; , &quot;).value;
        if (token === &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;) {
            grecaptcha.ready(() => {
                grecaptcha
                    .execute(window.reCaptchaSiteKey, { action: &quot; , &quot;'&quot; , &quot;requestquoteservicepage&quot; , &quot;'&quot; , &quot; })
                    .then(token => {
                        
                        document.getElementById(&quot; , &quot;'&quot; , &quot;4ff9088c-fd6d-4104-b852-afa5cc59e4a7-captchaToken&quot; , &quot;'&quot; , &quot;).value = token;
                    })
                    .catch(error => {
                        console.error(error);
                    });
            });
        }
    };
    //the recaptcha token valid upto 2 min only, so here genarating new token for every 1.5 min.
    setInterval(function () {
        generateCaptchaRequestForQuoteSolutionsAndServices();
    }, 1.5 * 60 * 1000);
    //Intial token genarator
    generateCaptchaRequestForQuoteSolutionsAndServices();





    


    
                                    
                                &quot;) or . = concat(&quot;
                                    Request for Quote
                                    
                                        
    
        










    

    
        
            
            Enter Your Name *
            
        
    
    
        
            
            Enter Your Email ID *
            
        
    
    
        
            
            Enter Your Phone Number *
            
        
    
    
        
            
            Message
        
    
    
        

            
                
            

        
    
    
        
    
    
    
        Email alredy Exist,Please try after 24 hours
    
    
        
    







window.reCaptchaSiteKey = &quot; , &quot;'&quot; , &quot;6LdKBfsnAAAAAH5DtEBBV8uRVpcfZZiIITG64gKU&quot; , &quot;'&quot; , &quot;;


    //to genarate token  and append for recaptcha  hidden field.
    function generateCaptchaRequestForQuoteSolutionsAndServices() {
        grecaptcha.ready(() => {
            grecaptcha
                .execute(window.reCaptchaSiteKey, { action: &quot; , &quot;'&quot; , &quot;requestquoteservicepage&quot; , &quot;'&quot; , &quot; })
                .then(token => {
                    
                    document.getElementById(&quot; , &quot;'&quot; , &quot;4ff9088c-fd6d-4104-b852-afa5cc59e4a7-captchaToken&quot; , &quot;'&quot; , &quot;).value = token;
                })
                .catch(error => {
                    console.error(error);
                });
        });
    };
    //to check recaptcha hidden field is empty or not,before submission of form.
    function onBeginSubmitRequestForQuoteSolutionsAndServices() {
        var token = document.getElementById(&quot; , &quot;'&quot; , &quot;4ff9088c-fd6d-4104-b852-afa5cc59e4a7-captchaToken&quot; , &quot;'&quot; , &quot;).value;
        if (token === &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;) {
            grecaptcha.ready(() => {
                grecaptcha
                    .execute(window.reCaptchaSiteKey, { action: &quot; , &quot;'&quot; , &quot;requestquoteservicepage&quot; , &quot;'&quot; , &quot; })
                    .then(token => {
                        
                        document.getElementById(&quot; , &quot;'&quot; , &quot;4ff9088c-fd6d-4104-b852-afa5cc59e4a7-captchaToken&quot; , &quot;'&quot; , &quot;).value = token;
                    })
                    .catch(error => {
                        console.error(error);
                    });
            });
        }
    };
    //the recaptcha token valid upto 2 min only, so here genarating new token for every 1.5 min.
    setInterval(function () {
        generateCaptchaRequestForQuoteSolutionsAndServices();
    }, 1.5 * 60 * 1000);
    //Intial token genarator
    generateCaptchaRequestForQuoteSolutionsAndServices();





    


    
                                    
                                &quot;))]</value>
      <webElementGuid>c3287321-89b5-44cc-a772-9fbd8109fece</webElementGuid>
   </webElementXpaths>
</WebElementEntity>
