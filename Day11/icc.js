document.getElementById('showLocationBtn').addEventListener('click', function() {
    const venueLocationSection = document.getElementById('venueLocation');
    const mapIframe = document.getElementById('map');

    if (venueLocationSection.style.display === 'none') {
        venueLocationSection.style.display = 'block';
        mapIframe.src = 'https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3770.8438986803863!2d72.82441401523547!3d19.01501878713233!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x3be7ce1b24c83e13%3A0xf2e537e944b1357d!2sWankhede%20Stadium!5e0!3m2!1sen!2sin!4v1621429514839!5m2!1sen!2sin';
    } else {
        venueLocationSection.style.display = 'none';
        mapIframe.src = '';
    }
});